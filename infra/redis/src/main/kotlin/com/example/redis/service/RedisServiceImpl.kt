package com.example.redis.service

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.data.redis.core.ReactiveRedisTemplate
import reactor.core.publisher.Mono

class RedisServiceImpl(
    private val redisTemplate: ReactiveRedisTemplate<String, String>,
    private val objectMapper: ObjectMapper
) {
    private val valueOps = redisTemplate.opsForValue();
    private val listOps = redisTemplate.opsForList()




    fun <TValue> set(key: String, value: TValue): Mono<Boolean> {
        val json = objectMapper.writeValueAsString(value);
        return set(key, json);
    }
    fun set(key: String, value: String): Mono<Boolean>{
        return valueOps.set(key, value);
    }

    fun <TValue> leftPush(key: String, value: TValue){
        val json = objectMapper.writeValueAsString(value)
        leftPush(key, json);
    }

    fun leftPush(key: String, value: String){
        listOps.leftPush(key, value);
    }

    fun trimLeft(key: String, index: Long){
        trim(key, 0, index)
    }

    fun trim(key: String, start: Long, end: Long){
        listOps.trim(key, start, end);
    }
}