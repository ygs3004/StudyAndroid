package com.ygs.kotlinbasics

// Super Class, Partent Class, Base Class
// open -> 상속 가능
open class Vehicle{
    // properties
    // methods
}

// sealed class Car => 상속 불가
// open class Car2: Vehicle(){ => 상속 가능


open class Car2(val name: String, val brand: String){
    open var range: Double = 0.0

    fun extendRagne(amount: Double) {
        if(amount > 0 ){
            range += amount
        }
    }

    open fun drive(distance: Double) {
        println("이 차의 주행거리는 $distance 입니다.")
    }


}

class ElectricCar(name: String, brand: String, batteryLif: Double): Car2(name, brand){
    override var range = batteryLif * 6

    var chargerType = "Type1"

    override fun drive(distance: Double){
        println("이 전기차의 주행거리는 $range 입니다.")
    }

    fun drive() {
        println("이 전기차의 주행거리는 $range 입니다.")
    }
}


// Any class inherits from the Any Class -> 자바의 Object
fun main() {
    var audiA3 = Car2("A3", "Audi")
    var teslaS = ElectricCar("S-Model", "Tesla", batteryLif = 85.0)

    teslaS.chargerType = "Type2"

    teslaS.extendRagne(200.0)
    teslaS.drive()

    // 다형성
    audiA3.drive(200.0)
    teslaS.drive(200.0)

}