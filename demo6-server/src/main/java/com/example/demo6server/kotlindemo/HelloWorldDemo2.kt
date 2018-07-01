package com.example.demo6server.kotlindemo
import com.example.demo6server.kotlindemo2.multiply
import com.example.demo6server.kotlindemo2.multiply as m

fun main(args: Array<String>) {
    val a: Int = 1
    val b = 2
    var c: Int

    c = 3

    var d :Int
    d=4

    // 注释嵌套
    /*
    /*

     */
     */
    println(d)

    var x = 10
    var y:Byte =20
//    x= y 不可以这么赋值

    x= y.toInt()


    println(multiply(100,200))

    // val 不可以修改 var可以修改
    val m = intArrayOf(1,2,3,4)
    m.set(0,100)

    for (item in m){
        println(item)
    }


}