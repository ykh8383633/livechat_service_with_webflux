package com.example.domain.enums

enum class UserType(val typeString: String) {
    ADMIN("ADMIN"),
    NORMAL_USER("NORMAL_USER"),
    ROOM_OWNER("ROOM_OWNER"),
    ROOM_MANAGER("ROOM_MANAGER"),
    BANNED_USER("BANNED_USER"),
    MUTE_USER("MUTE_USER")
    ;

    companion object{
        @JvmStatic
        fun parse(typeString: String): UserType =
            requireNotNull(values().find{ it.typeString == typeString }) { "UserType parse failed (invalid typeString)" }
    }
}