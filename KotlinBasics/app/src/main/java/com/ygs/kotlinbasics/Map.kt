package com.ygs.kotlinbasics

fun main() {

    val daysOfTheWeek = mapOf(1 to "월", 2 to "화", 3 to "수")
//    print(daysOfTheWeek[2])

    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruit("포도", 2.5), "OK" to Fruit("사과", 1.0))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[5] = "금"
    newDaysOfWeek[4] = "목"

    println(newDaysOfWeek.toSortedMap())

}

// data class Fruit(val name: String, val price:Double)