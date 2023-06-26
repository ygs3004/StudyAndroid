package com.ygs.kotlinbasics

fun main() {

    for (i in 1 until 20) {
        if(i/2 == 5){
            continue
        }
        print("$i ")
    }

    println()

    for (i in 1 until 20) {
        print("$i ")
        if(i/2 == 5){
            break
        }
    }
    println("Loop 종료")
}