package com.ygs.kotlinbasics

class OuterClass {

    private var name: String = "Mr X"

    // outer class 접근 불가
    // static
    class NestedClass {
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo() {
            // print("name is ${name}") // cannot access the outer class member
            println("Id is ${id}")
        }
    }

    // outer class 변수에 접근가능
    inner class InnerClass {
        var description: String = "code inside inner class"
        private var id: Int = 101
        fun foo() {
            println("name is ${name}")
            println("Id is ${id}")
        }
    }

}

fun main() {

    println(OuterClass.NestedClass().description)
    var obj = OuterClass.NestedClass() // object creation
    obj.foo()

    println(OuterClass().InnerClass().description)
    var obj2 = OuterClass().InnerClass() // object creation
    obj2.foo()

}