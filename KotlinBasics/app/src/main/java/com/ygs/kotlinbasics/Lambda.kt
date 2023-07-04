package com.ygs.kotlinbasics

fun main() {
    // val sum:(Int, Int) -> Int = {a:Int, b:Int -> a+b}
    val sum = {a:Int, b:Int -> a+b}
    println(sum(10,2))
}

fun addNumber(a:Int, b:Int){
    val addNumber = a+b
    println(a+b)
}