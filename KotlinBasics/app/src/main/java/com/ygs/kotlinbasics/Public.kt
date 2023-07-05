package com.ygs.kotlinbasics


fun main() {
    val base = Base();
    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible

    val derived = Derived()
    // derived.c is not visible
}
open class Base {
    var a = 1 // public
    private var b = 2 // private to Base class
    protected open val c = 3 // visible to the Base and the Derived class
    internal val d = 4 // visible inside the same module
    protected fun e(): Int{
        return 1
    } // visible to the Base and the Derived class
}

class Derived: Base(){
    // a, c, d, and e() of the Base class are visible
    // b is not visible
    override val c = 9 // c is protected
}

