package com.ygs.kotlinbasics

fun main() {
    var ygs = Person("GS", "Yoon")
    var ygs2:Person = Person()
    var blahYoon = Person("blah")
    var GunsooKim = Person(lastName = "Kim")
}

class Person (firstName: String = "Gunsoo", lastName: String = "Yoon"){

    // Initializer Block
    init {
        println("사람을 만든다! 이름은 $firstName, 성은 $lastName 입니다~")
    }
}