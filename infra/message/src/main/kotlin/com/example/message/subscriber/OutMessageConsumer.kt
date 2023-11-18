package com.example.message.subscriber

import com.example.message.channel.Channel
import com.example.message.channel.OutMessageChannel
import com.example.message.model.ChatMessage
import com.example.message.subscriber.handler.MessageHandler
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.reactive.ReactiveKafkaConsumerTemplate
import org.springframework.stereotype.Component
import reactor.kafka.receiver.ReceiverOptions
import java.util.*

@Component
class OutMessageConsumer(
    private val kafkaConsumerFactory: ConsumerFactory<String, String>,
    private val outMessageChannel: OutMessageChannel,
    private val handlers: MutableList<MessageHandler>
) : Subscriber {
    override val channels: MutableList<Channel> = mutableListOf(outMessageChannel)
    private val consumer = reactiveKafkaConsumerTemplate();
    private val messageHandlers = handlers

    init {
        consumer
            .receiveAutoAck()
            .map{it.value()}
            .doOnNext{message ->
                println("consume: $message")
                messageHandlers.forEach{ handler ->
                    handler.handle(message)
                }
            }
            .subscribe()
    }

    private fun reactiveKafkaConsumerTemplate(): ReactiveKafkaConsumerTemplate<String, String>{
        val receiverOptions: ReceiverOptions<String, String> =
            ReceiverOptions.create<String?, String?>(kafkaConsumerFactory.configurationProperties)
                .subscription(channels.map { channel -> channel.channelName })

        return ReactiveKafkaConsumerTemplate(receiverOptions)
    }

    fun registerHandler(handler: MessageHandler){
        messageHandlers.add(handler)
    }

}