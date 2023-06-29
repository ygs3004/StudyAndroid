package com.ygs.kotlinbasics

// Super Class, Partent Class, Base Class
// open -> 상속 가능
open class Vehicle{
    // properties
    // methods
}

// sealed class Car => 상속 불가
// open class Car2: Vehicle(){ => 상속 가능

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("멈춰")
    }
}


open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
    open var range: Double = 0.0

    fun extendRagne(amount: Double) {
        if(amount > 0 ){
            range += amount
        }
    }

//    override fun drive(): String{
//        return "driving the interface drive"
//    }
    override fun drive(): String = "인터페이스 운전 중"

    open fun drive(distance: Double) {
        println("이 차의 주행거리는 $distance 입니다.")
    }


}

class ElectricCar(override val maxSpeed:Double, name: String, brand: String, batteryLif: Double): Car(maxSpeed, name, brand){
    override var range = batteryLif * 6

    var chargerType = "Type1"

    override fun drive(distance: Double){
        println("이 전기차의 주행거리는 $range 입니다.")
    }

    override fun drive():String {
        return "이 전기차의 주행거리는 $range 입니다."
    }

    override fun brake() {
        super.brake()
        println("전기차가 멈췄습니다.")
    }
}


// Any class inherits from the Any Class -> 자바의 Object
fun main() {
    var audiA3 = Car(200.0, "A3", "Audi")
    var teslaS = ElectricCar(240.0, "S-Model", "Tesla", batteryLif = 85.0)

    teslaS.chargerType = "Type2"

    teslaS.extendRagne(200.0)
//    teslaS.drive()
    teslaS.brake();
    audiA3.brake()

    // 다형성
//    audiA3.drive(200.0)
//    teslaS.drive(200.0)

}