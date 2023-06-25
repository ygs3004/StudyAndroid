package com.ygs.kotlinbasics

fun main(){

    // val => immutable
    val isVal = "변경불가"

    // var => mutable
    // type string
    var myName = "Yoon un Soo"
    // type int 32bit
    // 타입이 적혀있지 않을경우 => 타입추론
    var myAge = 33
    
    // Integer TYPES: Byte(8bit), Short(16bit), Int(32bit), Long(64bit)
    val myByte: Byte = 127
    val myShort: Short = 259
    val myInt: Int = 13_213_123
    val myLong: Long = 12_039_123_123_123_213
    println(myInt)
    println(myLong)

    // Floating TYPES: Float(32bit), Double(64bit)
    val myFloat: Float = 1.1F
    val myDouble: Double = 3.14162592

    // Boolean: true and false
    // var isSunny: Boolean = true
    var isSunny = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // String
    val myStr = "Hello World"
    val firstCharInStr = myStr[0]
    val lastCharInStr = myStr[myStr.length-1]
    println("First Character: $firstCharInStr")
    println("Last Character: $lastCharInStr")

    println("First character : $firstCharInStr and the length of myStr is ${myStr.length}" )

}