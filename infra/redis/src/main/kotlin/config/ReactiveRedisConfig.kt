package config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.core.ReactiveRedisOperations
import org.springframework.data.redis.core.ReactiveRedisTemplate
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer
import org.springframework.data.redis.serializer.RedisSerializationContext
import org.springframework.data.redis.serializer.StringRedisSerializer

@Configuration
class ReactiveRedisConfig(
    @Value("\${spring.data.redis.host}") private val host: String,
    @Value("\${spring.data.redis.port}") private val port: Int
) {

    @Bean
    fun redisConnectionFactory(): ReactiveRedisConnectionFactory{
        return LettuceConnectionFactory(host, port);
    }

    @Bean
    fun redisTemplate(factory: ReactiveRedisConnectionFactory): ReactiveRedisTemplate<String, String>{
        val serializer = StringRedisSerializer()
        val jacksonSerializer = Jackson2JsonRedisSerializer(Any::class.java)
        val serializerContext = RedisSerializationContext.newSerializationContext<String, String>()
            .key(serializer)
            .value(serializer)
            .hashKey(serializer)
            .hashValue(jacksonSerializer)
            .build();

        return ReactiveRedisTemplate(factory, serializerContext);
    }


}