package com.example.message.subscriber

import com.example.message.channel.Channel
import com.example.message.channel.OutMessageChannel
import com.example.message.subscriber.handler.MessageHandler
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.reactive.ReactiveKafkaConsumerTemplate
import org.springframework.stereotype.Component
import reactor.kafka.receiver.ReceiverOptions

@Component
class Consumer(
    private val kafkaConsumerFactory: ConsumerFactory<String, String>,
    private val handlers: MutableList<MessageHandler>
) : Subscriber {
    override val channels: MutableSet<Channel> = handlers.map{it.channel}.toMutableSet()
    private val consumerTemplate = reactiveKafkaConsumerTemplate();
    private val handlerMap: MutableMap<String, MutableList<MessageHandler>> = initHandlerMap()

    init {
        if(handlers.isNotEmpty()){
            consumerTemplate
                .receiveAutoAck()
                .doOnNext{consumerRecord ->
                    val message = consumerRecord.value()
                    val topic = consumerRecord.topic()

                    println("consume: $message")
                    handlerMap.getOrDefault(topic, mutableListOf())
                        .forEach{it.handle(message)}
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

    private fun initHandlerMap(): MutableMap<String, MutableList<MessageHandler>>{
         val map = mutableMapOf<String, MutableList<MessageHandler>>()

        handlers.forEach{
            val handlerList = map.getOrPut(it.channel.channelName){ mutableListOf() }
            handlerList.add(it)
        }

        return map
    }


}