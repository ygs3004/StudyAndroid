package com.ygs.kotlinbasics
//저희 예제의 MobilePhone 클래스를 __를 이용해 확장해 주세요
//배터리 잔량을 나타내는 멤버를 추가합니다
//(“battery”라고 지정합시다
//0과 50 사이의 숫자로 초기화합니다)
//그런 다음 “chargeBattery” 함수를 추가합니다
//얼마가 충전되었는지에 대한 세부사항이 필요합니다
//이제 휴대폰 배터리가 얼마였는지, 얼마나 충전되었는지, 이제 배터리가 얼마인지 값이 출력될 것입니다
//클래스의 개체를 만들고 이 함수를 호출합시다
//배터리를 30만큼 충전해보세요

fun main() {
    var phone = MobilePhone("안드로이드", "삼성", "갤럭시")
    phone.changeBattery();
}



class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    var battery :Int = 25;

    fun chargeBattery(value: Int){
        this.battery += value
    }

    fun changeBattery(){
        val charge = 30;
        println("현재 배터리 충전량은 $battery 입니다. ")
        chargeBattery(charge)
        println("$charge 만큼 충전한 현재의 배터리는 ${battery}입니다.")
    }

}
