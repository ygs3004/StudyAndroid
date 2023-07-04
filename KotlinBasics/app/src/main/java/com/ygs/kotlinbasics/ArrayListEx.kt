package com.ygs.kotlinbasics

//arrrayList에 5개의 숫자 (더블)을 더한 프로그램을 작성한 그 숫자들의 평균을 계산해보세요
//이 연습에서는 for (in) 루프를 사용해주세요
//행운을 빕니다 :)

fun main() {

    val list =  arrayListOf<Double>(1.0, 2.0, 3.0, 4.0, 5.0)
    var sum:Double = 0.0
    for(number in list) {
        sum += number
    }

    println(sum/list.size)


}