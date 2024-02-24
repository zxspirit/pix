package com.newzhxu.com.newzhxu.初识kotlin开发2.kotlin程序的输入和输出

/**
 * 从控制台读取输入的字符串转化成int
 */
fun main(args: Array<String>) {
    println("请输入一个数字")
    val userInput = readlnOrNull()
    if (!userInput.isNullOrEmpty()) {
        val number = userInput.toInt()
        println("$number * 2 = ${number * 2}")
    }
}