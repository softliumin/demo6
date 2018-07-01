package com.example.demo6server.kotlindemo


fun main(args: Array<String>) {

    println(conver2Int("abab"))
    println(conver2Int("234"))
}

// Int Int?
fun conver2Int(str: String): Int? {
    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        return null
    }
}

fun printMultiply(a: String, b: String) {

    var a2Int = conver2Int(a)
    var b2Int = conver2Int(b)

    if (null != a2Int && null != b2Int) {
        println(a2Int * b2Int)
    } else {
        println("param not int")
    }
}

fun printMultiply2(a: String, b: String) {
    var a2Int = conver2Int(a)
    var b2Int = conver2Int(b)

    // Int Int?
    // println(a2Int * b2Int)

    if (null == a2Int) {
        println("param a  not int")

    } else if (null == b2Int) {
        println("param b  not int")
    } else {
        println(a2Int * b2Int)
    }
}