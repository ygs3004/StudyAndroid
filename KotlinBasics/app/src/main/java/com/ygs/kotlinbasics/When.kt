package com.ygs.kotlinbasics

fun main() {
    val season = 5;
    when(season){
        1 -> println("봄")
        2 -> println("여름")
        3 -> {
            println("가을")
            println("독서의 계절!")
        }
        4 -> println("겨울")
        else -> println("계절이 아닌뎁쇼")
    }

    val month = 10
    when(month){
       in 3..5 -> println("봄")
       in 6..8 -> println("여름")
       in 11 downTo 9 -> println("가을")
       12,1,2 -> println("여름")
    }

    val age = 21
    when(age){
        !in 0..20 -> println("술 마실수 있다!")
        in 18 .. 20 -> println("투표할 수 있다.")
        in 16 .. 17 -> println("운전가능!")
        else -> println("너무 어려!")
    }

    val x:Any = 13.37F
    when(x){
        is Int -> println("$x 는 Int 입니다.")
        // is Double -> println("$x 는 Double 입니다.")
        !is Double -> println("$x 는 Double 이 아닙니다.")
        is String -> println("$x 는 String 입니다.")
        else -> println("$x 정체가 머니?")
    }
}