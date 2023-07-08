package com.ygs.kotlinbasics

fun main() {
    // val obj:Any? = null
    // val str:String = obj as String
    // println(str) //Exception in thread "main" java.lang.NullPointerException: null cannot be cast to non-null type kotlin.String

    // val obj2: Any = 123
    // val str2: String = obj as String
    // println(str2) Exception in thread "main" java.lang.NullPointerException: null cannot be cast to non-null type kotlin.String

    val obj: Any? = "String unsafe cast"
    val str: String? = obj as String?
    println(str)

    val location:Any = "Kotlin"
    val safeString:String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
}