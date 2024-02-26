package com.example.spamProcessor.handlers.validator

import com.example.domain.enums.RedisKey
import com.example.domain.model.ChatMessage
import com.example.domain.model.ChatValidateResult
import com.example.domain.model.ChatValidator
import com.example.redis.service.RedisService
import org.springframework.stereotype.Component
import java.lang.StringBuilder

//@Component
class DefaultSpamChatValidator(
    redisService: RedisService
): ChatValidator {
    private lateinit var targetWords: MutableList<String>

    init {
        println("default validator is on...")
        val key = RedisKey.FORBIDDEN_WORDS.createKey(null);
        targetWords = redisService.getAll(key).toIterable().toMutableList()

    }

    override fun validate(chat: ChatMessage): ChatValidateResult {
        val message = chat.message;
        val includeWords = mutableListOf<String>();
        val result = ChatValidateResult(chat = chat, valid = true);

        for(target in targetWords){
            if(message.contains(target)){
                includeWords.add(target)
            }
        }

        if(includeWords.isNotEmpty()){
            result.valid = false
            result.reason = createReason(includeWords)
        }

        return result;
    }

    private fun createReason(includedWords: Iterable<String>): String{
        val sb = StringBuilder();
        sb.append("금기어 채팅: ")

        for((idx, word) in includedWords.withIndex()){
            if(idx != 0){
                sb.append(", ")
            }
            sb.append(word)
        }

        return sb.toString()
    }
}