package com.example.redis.service

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface RedisService {
    fun <TValue> set(key: String, value: TValue): Mono<Boolean>
    fun set(key: String, value: String): Mono<Boolean>
    fun <TValue> leftPush(key: String, value: TValue): Mono<Long>
    fun leftPush(key: String, value: String): Mono<Long>
    fun trimLeft(key: String, index: Long)
    fun trim(key: String, start: Long, end: Long)
    fun <TValue> getAll(key: String, clazz: Class<TValue>): Flux<TValue>
    fun getAll(key: String): Flux<String>
    fun <TValue> range(key: String, start: Long, end: Long, clazz: Class<TValue>): Flux<TValue>
    fun range(key: String, start: Long, end: Long): Flux<String>
}