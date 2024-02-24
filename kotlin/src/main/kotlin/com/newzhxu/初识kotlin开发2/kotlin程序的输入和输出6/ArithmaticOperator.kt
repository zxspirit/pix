package com.newzhxu.com.newzhxu.初识kotlin开发2.kotlin程序的输入和输出6

fun main() {
    val intNum = 103
    //整除
    val result = intNum / 10
    //输出：result=10, class kotlin.Int
    println("result=$result, ${result::class}")

    //浮点除法
    val otherResult = intNum / 10.0
    //输出：otherResult=10.3,class kotlin.Double
    println("otherResult=$otherResult,${otherResult::class}")

    //取余
    val thirdResult = intNum % 10
    //输出：thirdResult=3
    println("thirdResult=$thirdResult,${thirdResult::class}")
}