package com.ygs.kotlinbasics
//반복문 연습하기
//0부터 10000 범위의 루프를 작성합니다
//9001이 되면 “IT’S OVER 9000!!!”를 표시할 겁니다
//humidity(humidityLevel이 아닌)를 체크하는 루프를 작성해보세요
//humidityLevel 변수는 80에서부터 시작합니다
//변수 humidity는 “humid”로 초기화됩니다
//“humid”하다면 “humidityLevel”을 5만큼 줄여야 하고 “humidity decreased”를 출력해야 합니다
//humidityLevel이 60 이하로 떨어진다면 “it’s comfy now”를 출력하고 humidity를 “comfy”로 설정할 것입니다

fun main() {
    for(i in 0..10000){
        if(i == 9001)
        println("IT'S OVER 9000!!!")
    }

    var humidityLevel = 80
    var humidity = "humid"

    while(humidity == "humid"){
        humidityLevel -= 5;
        println("humidity decreased")

        if(humidityLevel <= 60){
            println("it's comfy now")
            humidity = "comfy"
        }
    }

}