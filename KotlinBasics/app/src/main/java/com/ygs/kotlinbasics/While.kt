package com.ygs.kotlinbasics

fun main() {
    var x = 1
    while (x <= 10) {
        println("$x")
        x++
    }
    println("while 종료")

    var y = 100
    while (y >= 0) {
        println("$y")
        y -= 2
    }
    println("while 종료2")

    x=1;
    do{
        println("$x")
        x++;
    }while(x<=10)
    println("do while 종료")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("따뜻해 이제~")
        }
    }
}