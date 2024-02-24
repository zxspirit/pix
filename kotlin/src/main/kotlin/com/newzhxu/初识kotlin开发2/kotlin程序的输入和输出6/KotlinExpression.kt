package com.newzhxu.com.newzhxu.初识kotlin开发2.kotlin程序的输入和输出6

fun main(args: Array<String>) {

    val num = 100
    //单独的一个变量是表达式
    println(num) //100

    //变量、运算符和字面量，构成最常见的表达式
    //表达式的结果可以传给一个变量
    val isNumGreaterThan20 = (num > 20)
    println(isNumGreaterThan20) //true

    //在可以接收一个值的任何地方，都可以传送一个表达式
    //下面就是将num*2这个表达式直接传给了println函数
    println(num * 2) //200

    //函数调用也是一个表达式
    println(maxOf(1, 2)) //2

    //表达式可以组合起来，构建一个更大的表达式
    //输出：1和2中的大数是：2
    println("1和2中的大数是：${maxOf(1, 2)}")
}