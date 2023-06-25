package com.ygs.kotlinbasics

fun main() {
    val heightPerson1 = 170
    val heightPerson2 = 189
    if(heightPerson1 > heightPerson2){
        println("1번 사람이 더 큽니다.")
    }else if( heightPerson1 == heightPerson2){
        println("키가 같습니다.")
    }else{
        println("2번 사람이 더 큽니다.")
    }

    val age = 31;
    
    if(age >= 30) println("30이 넘었네요")
    
    if(age>=21){
        println("술 마실수 있습니다.")
    }else if(age>=18){
        println("투표권이 있어요")
    }else if(age>=16){
        println("Denis 의 나라에서 운전할 수 있습니다.")
    }else{
        println("엄청 어리네요!")
    }

}
