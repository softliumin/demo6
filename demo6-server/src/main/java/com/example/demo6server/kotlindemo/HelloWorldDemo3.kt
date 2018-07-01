package com.example.demo6server.kotlindemo

fun main(args: Array<String>) {

    var x = 10
    var y = 20
    var max: Int
    var min: Int

    if (x > y) {
        max = x
        min = y
    } else {
        max = y
        min = x
    }

    min = if (x > y) x else y
    max = if (x > y) y else x

    max = if (x > y) {
        print("x>y")
        x
    } else {
        println("x<=y")
        y
    }


    println("max=$max , min = $min")
}