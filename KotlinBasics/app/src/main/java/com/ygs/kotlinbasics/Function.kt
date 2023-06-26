package com.ygs.kotlinbasics

fun main() {
    myFunction()

    val result = addUp(5, 3)
    println("$result")

    val result2 = avg(5.0, 3.0)
    println("평균값 $result2")
}

// Method : class 안의 Function 을 의미
// Parameter : input 값을 의미, 인수(argument)랑 다름

fun addUp(a: Int, b: Int): Int {
    return a+b;
}

fun avg(a:Double, b:Double) : Double{
    return (a+b)/2;
}

fun myFunction() {
    println("함수 호출!")
}