package com.newzhxu.com.newzhxu.初识kotlin开发2.kotlin程序的输入和输出6

fun main(args: Array<String>) {
    val num1 = 15
    val num2 = 20
    //加法
    val sum = num1.plus(num2)
    println("sum=$sum")  //sum=35
    //减法
    val difference = num1.minus(num2) //difference=-5
    println("difference=$difference")
    //乘法
    val product = num1.times(num2)
    println("product=$product") //product=300
    //除法
    val quotient: Double = num1.toDouble().div(num2)
    println("quotient=$quotient") //quotient=0.75
    //取余
    val remainder = num1.rem(num2)
    println("remainder=$remainder") //remainder=15
    //绝对值
    val absolute = Math.abs(-100.5)
    println("absolute=$absolute") //absolute=100.5
    //取整(四舍五入)
    println("rounded=${Math.round(9.57)}") //rounded=10
}