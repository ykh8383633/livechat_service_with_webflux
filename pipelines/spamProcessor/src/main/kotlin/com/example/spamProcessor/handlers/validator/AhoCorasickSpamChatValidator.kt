package com.example.spamProcessor.handlers.validator

import com.example.domain.enums.RedisKey
import com.example.domain.model.ChatMessage
import com.example.domain.model.ChatValidateResult
import com.example.domain.model.ChatValidator
import com.example.redis.service.RedisService
import org.ahocorasick.trie.Trie
import org.springframework.stereotype.Component
import java.lang.StringBuilder

@Component
class AhoCorasickSpamChatValidator(
    redisService: RedisService
): ChatValidator {
    private lateinit var trie: Trie

    init{
        val key = RedisKey.FORBIDDEN_WORDS.createKey(null);
        val targetWords = redisService.getAll(key)
            .toIterable()

        trie = Trie.builder()
            .ignoreOverlaps()
            .addKeywords(targetWords.toList())
            .build()
    }

    override fun validate(chat: ChatMessage): ChatValidateResult {
        val includedWords = trie.parseText(chat.message);
        val result = ChatValidateResult(chat = chat, valid = true);

        if(!includedWords.isNullOrEmpty()){
            result.valid = false;
            result.reason = createReason(includedWords.map{it.keyword})
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