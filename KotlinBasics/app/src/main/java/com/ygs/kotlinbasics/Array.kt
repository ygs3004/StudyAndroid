package com.ygs.kotlinbasics

fun main() {

    // val numbers: IntArray = intArrayOf(1,2,3,4,5,6)
    // val numbers = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)
    val numbersD: DoubleArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
    // println(numbers) // [Ljava.lang.Integer;@511baa65
    // println(numbers.contentToString()) // [1, 2, 3, 4, 5, 6]

    // for(element in numbers){
    //     println("${element + 2}")
    // }

    println("initial values ${numbers.contentToString()}")
    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1
    println("final values ${numbers.contentToString()}")

    println("initial values D ${numbersD.contentToString()}")
    numbersD[0] = 6.0
    numbersD[1] = 5.0
    numbersD[4] = 2.0
    numbersD[5] = 1.0
    println("final values D ${numbersD.contentToString()}")

    val days = arrayOf("Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    println(fruits.contentToString())

    for(fruit in fruits){
        println("${fruit.name}")
    }

    for(index in fruits.indices){
        println("${fruits[index].name} is in index $index ")
    }


    val mix = arrayOf("Sun", "Mon", "Tues", 1, 2, 3, Fruit("Apple", 2.5))
    println(mix.contentToString())

}

data class Fruit(val name:String, val price:Double)