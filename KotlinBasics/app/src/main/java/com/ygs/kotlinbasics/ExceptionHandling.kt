package com.ygs.kotlinbasics

import java.lang.NullPointerException

fun main() {
     val str = getNumber("10")
     println(str)

    try{
        val a = IntArray(5)
        a[5] = 10/0
    }catch (e: ArithmeticException){
        println("arithmetic exception catch")
    }catch(e:ArrayIndexOutOfBoundsException){
        println("array index out of bounds exception")
    }catch (e: Exception){
        println("parent eception class")
    }
    println("code after try catch")

    try{
        val data = 10/5
        println(data)
    }catch (e: NullPointerException){
        println(e)
    }finally {
        println("finally block always executes")
    }
    println("below code...")

    try{
        validate(12);
    }catch (e: ArithmeticException){
        println(e)
    }
}

fun getNumber(str:String):Int{
    return try{
        Integer.parseInt(str)/0
    }catch (e: ArithmeticException){
        0
    }
}

fun validate(age:Int){
    if(age<18)
        throw ArithmeticException("under age")
    else
        println("eligible for drive")
}