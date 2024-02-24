package com.newzhxu.com.newzhxu.初识kotlin开发2.kotlin程序的输入和输出6

fun main() {
    //定义一个字符串变量，它引用一个“ab”字符串对象
    var myString = "ab";
    //用另一个变量保存“ab”字符串对象的引用
    val myStringReference = myString

    //检查并确定两个变量是否引用同一个字符串对象“ab”
    println(myString === myStringReference) //true

    //尝试修改myString变量所引用“ab”字符串对象的内容，给它加上“cd”
    myString = myString + "cd";

    //貌似修改成功，myString变量现在引用一个内容为“abcd”的对象
    println(myString) //abcd
    //检查myStringReference所引用的字符串对象的值，发现其值仍是"ab"
    println(myStringReference) //ab
    //检查myStringReference与myString是否引用相同的字符串对象
    println(myString === myStringReference) //false
}