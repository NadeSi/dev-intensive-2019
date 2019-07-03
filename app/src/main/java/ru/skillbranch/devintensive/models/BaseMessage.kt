package ru.skillbranch.devintensive.models

import java.util.*

abstract class BaseMessage(
    val id: String,
    val from: User?,
    val chat: Chat,
    val isIncoming: Boolean = false,
    val date: Date = Date()
){
    abstract fun formatMessage():String

    companion object AbstractFactory{
        var lasdId = -1;
        fun makeMessage(from: User, chat: Chat, date: Date = Date(), type: String = "text", payLoad: Any?, isIncoming:Boolean = false): BaseMessage{
            lasdId++;
            return when(type){
                "image" -> ImageMessage("$lasdId", from, chat, date = date, image = payLoad as String, isIncoming = isIncoming)
                    else -> TextMessage("$lasdId", from, chat, date = date, text = payLoad as String, isIncoming = isIncoming)
            }
        }
    }
}