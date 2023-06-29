package com.ygs.kotlinbasics

import java.lang.IllegalArgumentException
//
//fun main() {
//    var myCar = Car();
//    println("내 차 브랜드: ${myCar.myBrand}")
//    // myCar.maxSpeed = 2
//    println("내 차 최고속도: ${myCar.maxSpeed}")
//    println("내 차 모델: ${myCar.myModel}")
//
//}
//
//class Car(){
//
//    lateinit var owner: String
//    val myBrand: String = "BMW"
//        // Custom getter
//        get(){
//            return field.toLowerCase();
//        }
//
//    var maxSpeed: Int = 250
//        // normal getter, setter
//        // get() = field
//        set(value){
//            field = if(value>0) value else throw IllegalArgumentException("0 보다 작은속도는 안돼!");
//        }
//
//    var myModel:String = "M5"
//    private set
//
//    init{
//        this.myModel = "M3" // private set 안에서는 가능
//        this.owner = "Frank"
//    }
//
//}