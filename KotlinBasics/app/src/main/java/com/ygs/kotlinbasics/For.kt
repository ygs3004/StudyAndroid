package com.ygs.kotlinbasics

fun main() {

    for(num in 1..10){
        println("$num")
    }

    for(i in 1 until 10){ // Same as - for(i in 1.until(10))
        println("$i")
    }
    println()

    for(i in 10 downTo 1){
        println("$i")
    }
    println()

    for(i in 10 downTo 1 step 2){  // Same as - for(i in 10.downTo(1).step(2))
        println("$i")
    }
}