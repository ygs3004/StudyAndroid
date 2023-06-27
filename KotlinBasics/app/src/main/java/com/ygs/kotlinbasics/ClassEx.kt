package com.ygs.kotlinbasics
//MobilePhone이라는 클래스를 만드십시오
//osName, brand 그리고 model이라는 세 가지 주요 생성 변수가 있어야 합니다
//이니셜라이저를 사용하여 세부 정보를 출력하세요
//메인 함수에 해당 클래스의 객체 3개를 만드세요
//예시로는 :
//Samsung Galaxy S20 Ultra
//여기서 osName은 Android, brand는 Samsung, model은 Galaxy S20 Ultra

fun main() {
    MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    MobilePhone("iOS", "Apple", "iPhone")
    MobilePhone("Android", "LG", "LG폰")
}

class MobilePhone(osName:String, brand:String, model:String){
    init{
        println("생성된 핸드폰의 OS 는 ${osName}이고, ${brand}사의 ${model}입니다.")
    }
}