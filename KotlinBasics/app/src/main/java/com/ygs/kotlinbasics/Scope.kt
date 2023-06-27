package com.ygs.kotlinbasics

var b = 3
fun main() {
    myFunction(5)
    b = 5
}

// a is a parameter
fun myFunction(a: Int) {
    b = a
    println("b is $b")
    // a is a variable
    var a = 4;
    println("a is $a")
}