package com.example.domain.enums

enum class RedisKey(val key: String) {
    USER_COUNT("USER_COUNT"),
    RECENT_CHAT("RECENT_CHAT"),
    FORBIDDEN_WORDS("FORBIDDEN_WORDS")
    ;

    open fun createKey(subKey: String?): String{
        if(subKey.isNullOrEmpty()){
            return key;
        }
        return "$key:${subKey}"
    }
}