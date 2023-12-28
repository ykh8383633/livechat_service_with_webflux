package com.example.persistence.config

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoClients
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import org.springframework.data.mongodb.core.MongoClientFactoryBean
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@Configuration
@EnableReactiveMongoRepositories(basePackages = ["com.example.persistence"])
class MongoConfig(
    @Value("\${spring.data.mongodb.host}") private val host: String,
    @Value("\${spring.data.mongodb.port}") private val port: Int
): AbstractReactiveMongoConfiguration()
{

    override fun configureClientSettings(builder: MongoClientSettings.Builder){
        builder.applyConnectionString(ConnectionString("mongodb://$host:$port"))
    }

    override fun getDatabaseName(): String {
        return "livechat"
    }
}