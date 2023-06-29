package com.ygs.kotlinbasics

abstract class Mammal(private val name: String, private val origin: String, private val weight: Double){
    // abstract => 반드시 override 해야함
    abstract var maxSpeed: Double
    abstract fun run()
    abstract fun breath()

    fun displayDetails(){
        println("이름: $name, 출신: $origin, 무게: $weight, 최고속도: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight){

    override fun run() {
        println("두 다리로 뛴다")
    }

    override fun breath() {
        println("코로 숨을 쉰다")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        println("네 다리로 뛴다")
    }

    override fun breath() {
        println("몸통으로 숨을 쉰다")
    }
}

fun main() {
    val human = Human("Ygs", "한국", 70.0, 28.0)
    val elephant = Elephant("끼리코", "인도", 5400.0, 25.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}