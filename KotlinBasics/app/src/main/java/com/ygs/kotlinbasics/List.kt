package com.ygs.kotlinbasics

fun main() {

    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false,"String")
    // println(anyTypes.size)
    // println(months[1])

    // for(month in months){
    //     println(month)
    // }

    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")
    val anotherMonths = arrayOf("August", "September", "October", "November", "December")
    additionalMonths.addAll(anotherMonths)
    println(additionalMonths)

    val days = mutableListOf<String>("월", "화", "수")
    days.add("목")
    days[2] = "일"
    // days.removeAt(3)
    val removeList = mutableListOf<String>("월", "수")
    days.removeAll(removeList)
    days.removeAll(days)
    println(days)

}


