package com.example.demo6server.kotlindemo

import java.util.function.Consumer


fun main(args: Array<String>) {
    println("Hello World")
    val list: List<String> = listOf("aa", "bb", "cc")

    for (str in list) {
        println(str)
    }

    list.forEach(Consumer { println(it) })

    list.forEach(System.out::println)
    println(sum2(100, 200))
    myPrint(200,101)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b


fun myPrint(a: Int, b: Int): Unit {
    println(a + b)
    println("$a + $b= ${a+b}")
}