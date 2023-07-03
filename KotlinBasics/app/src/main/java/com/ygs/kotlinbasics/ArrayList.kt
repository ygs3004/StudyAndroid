package com.ygs.kotlinbasics

fun main() {

    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println("......print ArrayList")
    for(i in arrayList){
        println(i)
    }

    val arrayList2: ArrayList<String> = ArrayList<String>(5)
    val list:MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    arrayList2.addAll(list)
    println("......print ArrayList")

    val itr = arrayList.iterator()

    while(itr.hasNext()){
        println(itr.next())
    }
    println("size of arrayList = ${arrayList.size}")
    println("arrayList.get(1) = ${arrayList.get(1)}")

}