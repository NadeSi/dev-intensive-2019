package ru.skillbranch.devintensive.utils

import android.service.voice.AlwaysOnHotwordDetector

object Utils {
    /*Реализуй метод Utils.parseFullName(fullName) принимающий в качестве аргумента полное имя пользователя (null, пустую строку)
    и возвращающий пару значений Pair(firstName, lastName) при невозможности распарсить полное имя или его часть вернуть null null/"firstName" null
Пример:
Utils.parseFullName(null) //null null
Utils.parseFullName("") //null null
Utils.parseFullName(" ") //null null
Utils.parseFullName("John") //John null*/
    fun parseFullName(fullName:String?):Pair<String?, String?> {
        //TODO FIX ME
        val parts: List<String>? = fullName?.split(" ")

        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)

        if(firstName.isNullOrBlank()){
            firstName = null
        }
        if(lastName.isNullOrBlank()){
            lastName = null
        }
//        return Pair(firstName, lastName);
        return firstName to lastName
    }

    fun transliteration(payload: String, divider: String = " "): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}