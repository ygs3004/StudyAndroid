package com.ygs.kotlinbasics

fun main() {

    val fruits = setOf("오렌지", "사과", "망고", "포도", "사과", "오렌지")
    println(fruits.size)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("수박")
    newFruits.add("배")
    println(newFruits)
    println(newFruits.elementAt(4))

}