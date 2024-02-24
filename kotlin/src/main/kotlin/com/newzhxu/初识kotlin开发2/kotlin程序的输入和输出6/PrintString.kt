package com.newzhxu.com.newzhxu.初识kotlin开发2.kotlin程序的输入和输出6

fun main() {
    //使用“\n”进行换行
    //输出结果：
    // 好好学习，
    // 天天向上！
    println(" 好好学习，\n 天天向上！")

    val html = """
        
        <h2>
             这是一个二级标题
        </h2>
        
    """
    println(html)  //将原样地输出字符串内容（包括其换行）

    //移除前后的空行
    println(html.trimMargin())
}