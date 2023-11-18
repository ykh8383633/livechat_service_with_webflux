package com.example.message.config

import com.example.message.config.properties.MessageProperties
import org.apache.kafka.clients.CommonClientConfigs
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.DefaultKafkaConsumerFactory
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.ProducerFactory
import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate
import org.springframework.kafka.support.serializer.JsonDeserializer
import org.springframework.kafka.support.serializer.JsonSerializer
import reactor.kafka.sender.SenderOptions

@Configuration
@EnableConfigurationProperties(MessageProperties::class)
class KafkaConfig(private val messageProps: MessageProperties) {

    @Bean
    fun reactiveKafkaProducerTemplate(producerFactory: ProducerFactory<String, String>): ReactiveKafkaProducerTemplate<String, String>{
        val options = SenderOptions.create<String, String>(producerFactory.configurationProperties)
        return ReactiveKafkaProducerTemplate(options)
    }

    @Bean
    fun kafkaProducerFactory(): ProducerFactory<String, String>{
        val configProps = getKafkaConfigBase()
        configProps[ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG] = StringSerializer::class.java
        configProps[ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG] = StringSerializer::class.java

        return DefaultKafkaProducerFactory(configProps);
    }

    @Bean
    fun kafkaConsumerFactory(): ConsumerFactory<String, String> {
        val configProps = getKafkaConfigBase()
        configProps[ConsumerConfig.GROUP_ID_CONFIG] = "1"

        configProps[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
        configProps[ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java

        return DefaultKafkaConsumerFactory(configProps)
    }

    fun getKafkaConfigBase(): MutableMap<String, Any>{
        val configProps = HashMap<String, Any>()
        configProps[CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG] = messageProps.kafka.bootstrapServers

        configProps["sasl.mechanism"] = "PLAIN"
        configProps["metadata.max.age.ms"] = "10800000" // 3hour
        configProps["connections.max.idle.ms"] = "10800000" // 3hour

        configProps["session.timeout.ms"] = "45000"

        return configProps
    }
}