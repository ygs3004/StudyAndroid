package com.ygs.kotlinbasics

import java.util.*

fun main() {
    // var name :String = "Ygs"
    // name = null -> 컴파일에러
    // var nullableName : String? = "Ygs"
    var nullableName : String? = null

    // var len = name.length

    var len2 = nullableName?.length
    // println(nullableName?.toLowerCase())
    nullableName?.let { println(it.length) }

    // ?: Elvis Operator
    val name = nullableName ?: "Guest"
    //println("name is $name")

    println(nullableName!!.toLowerCase());

    // if(nullableName != null){
    //     var len2 = nullableName.length
    // }else{
    //     null
    // }

    // chain safe calls
    // val wifeAge: String? = user?.wife?.age ?: 0

}