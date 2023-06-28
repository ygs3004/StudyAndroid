package com.ygs.kotlinbasics

data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Ygs")

//    val name = user1.name
//    println(name)
    user1.name = "NewYgs"
    val user2 = User(1, "NewYgs");

    println(user1.equals(user2))
    println(user1 == user2)

    println("User Detail: $user1")

    val updateUser = user1.copy(name="NewYgs")
    println("updateUser Detail: $updateUser")

    println(updateUser.component1())
    println(updateUser.component2())

    val (id, name) = updateUser
    println("id=$id, name=$name")

}