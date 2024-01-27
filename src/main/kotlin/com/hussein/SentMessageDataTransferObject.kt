package com.hussein

import com.google.firebase.messaging.Message
import com.google.firebase.messaging.Notification

data class SentMessageDataTransferObject(
    val to : String?,
    val notification : NotificationBody
)  //DTO class

class NotificationBody(
    val title : String,
    val body : String
)

fun SentMessageDataTransferObject.toMessage():Message{
    return Message.builder()
        .setNotification(Notification.builder()
            .setTitle(notification.title)
            .setTitle(notification.body)
            .build()
        ).apply {
            if(to == null){
                setTopic("chat")
            }
            else
            {
                setToken(to)
            }
        }
        .build()
        //.putAllData("abc","any data")
}