package com.ygs.kotlinbasics

import java.util.*

fun main() {
    var name :String = "Ygs"
    // name = null -> 컴파일에러
    var nullableName : String? = "Ygs"
    // nullableName = null

    var len = name.length

    var len2 = nullableName?.length
    // println(nullableName?.toLowerCase())
    nullableName?.let { println(it.length) }



    // if(nullableName != null){
    //     var len2 = nullableName.length
    // }else{
    //     null
    // }

}