package com.ygs.kotlinbasics

fun main(){

    // 산술 연산자(+, -, *, /, %)
    var result = 5+3
    val a: Double = 5.0
    val b = 3
    val resultDouble: Double = (a / b)
    println(resultDouble)

    // 비교 연산자(==, !=, <, >, <=, >=)
    val c = 5
    val d = 3
    val e = 5
    val isEqual = c==d
    println("isEqual is $isEqual")

    val isNotEqual = c!=e
    // String interpolation
    println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${c>d}")
    println("is-5Greater3 ${-c>d}")
    println("is5Lower3 ${c<=d}")

    //대입 증감 연산자(+=, -=, *=, /=, %=)
    var myNum = 5;
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

}
