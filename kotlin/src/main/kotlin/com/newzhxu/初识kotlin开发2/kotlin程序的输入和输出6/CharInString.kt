package com.newzhxu.com.newzhxu.初识kotlin开发2.kotlin程序的输入和输出6

fun main() {
    val str = "Hello"
    val secondChar: Char = str[1]
    println(secondChar)  //e
    //循环输出字符串中的所有字符
    for (c in str) {
        println("当前字符：$c，它对应于数字${c.code}，它在字母表中下一个字符是：${c.inc()}")
    }

    val chinese = '中';
    //输出：汉字“中”，它对应于数字20013,它在字符集中的下一字符是:丮
    println(
        "汉字“$chinese”，它对应于数字${chinese.toInt()}," +
                "它在字符集中的下一字符是:${chinese.inc()}"
    )

    val num = 20013
    //输出“中”
    println(num.toChar())

    //依据Unicode进行输出
    val symbol = '\u0f31'
    //输出：༱
    println(symbol)
}