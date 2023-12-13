package com.example.message.subscriber

import com.example.message.channel.Channel
import com.example.message.channel.OutMessageChannel
import com.example.message.subscriber.handler.MessageHandler
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.reactive.ReactiveKafkaConsumerTemplate
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.kafka.receiver.ReceiverOptions

@Component
class Consumer(
    private val kafkaConsumerFactory: ConsumerFactory<String, String>,
    private val handlers: MutableList<MessageHandler>
) : Subscriber {
    override val channels: MutableSet<Channel> = handlers.map{it.subscribedChannel}.toMutableSet()
    private val consumerTemplate = reactiveKafkaConsumerTemplate();
    private val handlerMap: MutableMap<String, MutableList<MessageHandler>> = initHandlers()

    init {
        if(handlers.isNotEmpty()){
            consumerTemplate
                .receiveAutoAck()
                .flatMap{consumerRecord ->
                    val message = consumerRecord.value()
                    val topic = consumerRecord.topic()

                    println("consume: $message")
                    Flux.fromIterable(handlerMap.getOrDefault(topic, mutableListOf()))
                        .zipWith(Mono.just(message))
                }
                .doOnNext{zip ->
                    val handler = zip.t1;
                    val message = zip.t2;
                    handler.handle(message);
                }
                .subscribe()
        }

    }

    private fun reactiveKafkaConsumerTemplate(): ReactiveKafkaConsumerTemplate<String, String>{
        val receiverOptions: ReceiverOptions<String, String> =
            ReceiverOptions.create<String?, String?>(kafkaConsumerFactory.configurationProperties)
                .subscription(channels.map { channel -> channel.channelName })

        return ReactiveKafkaConsumerTemplate(receiverOptions)
    }

    private fun initHandlers(): MutableMap<String, MutableList<MessageHandler>>{
         val map = mutableMapOf<String, MutableList<MessageHandler>>()

        handlers.forEach{
            val handlerList = map.getOrPut(it.subscribedChannel.channelName){ mutableListOf() }
            handlerList.add(it)
        }

        return map
    }


}