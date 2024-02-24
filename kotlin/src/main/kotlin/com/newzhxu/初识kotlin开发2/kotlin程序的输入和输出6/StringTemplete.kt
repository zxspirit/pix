package com.newzhxu.com.newzhxu.初识kotlin开发2.kotlin程序的输入和输出6

fun main(args: Array<String>) {
    val a = 1;
    val b = 2;
    //字符串模板，同时支持变量和表达式
    println("$a + $b = ${a + b}")   //输出1 + 2 = 3
}