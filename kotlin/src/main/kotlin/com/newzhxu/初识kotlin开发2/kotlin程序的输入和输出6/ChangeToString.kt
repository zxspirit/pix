package com.newzhxu.com.newzhxu.初识kotlin开发2.kotlin程序的输入和输出6

fun main(args: Array<String>) {
    val num = 100
    println(num::class)
    val numString = num.toString()
    val numString2 = "$num 转化为字符串"
    println(numString::class)
    println(numString2::class)
}