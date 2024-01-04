package com.example.domain.model

import com.example.domain.enums.AlertType

class Alert(
    var message: String? = null,
    var room: ChatRoom? = null,
    var toAll: Boolean = true,
    var targetUser: MutableList<ChatUser> = mutableListOf(),
    var type: AlertType = AlertType.INFO
) {

}