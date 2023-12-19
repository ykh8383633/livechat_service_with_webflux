package com.example.redis.service

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.data.redis.core.ReactiveRedisTemplate
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.doOnError

@Component
class RedisServiceImpl(
    redisTemplate: ReactiveRedisTemplate<String, String>,
    private val objectMapper: ObjectMapper
):RedisService {
    private val valueOps = redisTemplate.opsForValue();
    private val listOps = redisTemplate.opsForList()

    override fun <TValue> set(key: String, value: TValue): Mono<Boolean> {
        val json = objectMapper.writeValueAsString(value);
        return set(key, json);
    }
    override fun set(key: String, value: String): Mono<Boolean>{
        return valueOps.set(key, value);
    }

    override fun <TValue> leftPush(key: String, value: TValue): Mono<Long>{
        val json = objectMapper.writeValueAsString(value)
        return leftPush(key, json)
    }

    override fun leftPush(key: String, value: String): Mono<Long>{
        return listOps.leftPush(key, value)
            .doOnError{
                println(it.message)
            }
    }

    override fun trimLeft(key: String, index: Long): Mono<Boolean>{
        return trim(key, 0, index)
    }

    override fun trim(key: String, start: Long, end: Long): Mono<Boolean>{
        return listOps.trim(key, start, end);
    }

    override fun<TValue> getAll(key: String, clazz: Class<TValue>): Flux<TValue>{
        return range<TValue>(key, 0, -1, clazz);
    }

    override fun getAll(key: String): Flux<String>{
        return range(key, 0, -1)
    }

    override fun <TValue> range(key: String, start: Long, end: Long, clazz: Class<TValue>): Flux<TValue>{
        return range(key, start, end)
            .map{ objectMapper.readValue(it, clazz) }
    }

    override fun range(key: String, start: Long, end: Long): Flux<String>{
        return listOps.range(key, start, end);
    }

}