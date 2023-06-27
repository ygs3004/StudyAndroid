package com.ygs.kotlinbasics

fun main() {
    var ygs = Person("GS", "Yoon", 31)
    var ygs2:Person = Person()
    // var blahYoon = Person("blah")
    // var GunsooKim = Person(lastName = "Kim")
    ygs.hobby = "독서"
    ygs.age = 21;
    println("Ygs is ${ygs.age} years old")
    ygs.stateHobby()

    ygs2.hobby = "숙면"
    ygs2.stateHobby()
}

class Person (firstName: String = "Gunsoo", lastName: String = "Yoon"){
    //Member Variables - Properties
    var age: Int? = null
    var hobby: String = "게임"
    var firstName: String? = null

    // Initializer Block
    init {
        this.firstName = firstName
        println("안녕? 내 이름은 ${firstName}라고해, 성은 ${lastName}고")
    }

    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
        println("안녕? 내 이름은 ${firstName}라고해, 성은 ${lastName}고 ${age}살이야")
    }

    // Member functions - Methods
    fun stateHobby(){
        println("${firstName} 취미는 ${hobby}야 ㅎㅎ")
    }
}