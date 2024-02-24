package com.newzhxu.com.newzhxu.初识kotlin开发2.kotlin程序的输入和输出6

fun main(args: Array<String>) {
    val str = "Hello"
    println("字符串值为：$str")

    //字符串的唯一一个属性（Properties），
    // 其余的全都是方法（methods）
    println("字符串长：${str.length}");

    val firstChar = str.get(0)
    println("第一个字符为：$firstChar")
    println("最后一个字符为: ${str[str.length - 1]}")

    val subString = str.substring(1, 3);
    println("从第2个到第4个位置的子字符串为：$subString")

    val index = str.indexOf("o")
    println("o在字符串的位置索引为：$index")

}