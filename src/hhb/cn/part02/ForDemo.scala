package hhb.cn.part02

/**
 * @description:
 * Scala永远与Java相同的While 和 do While循环
 * 但是没有与Java for循环相对应的语法结果
 * Scala中 for( i <- 表达式或集合)，让循环变量i遍历 <- 右边表达式或集合的所有值
 * 注意：循环变量i前面没有用val或者var来修饰，这个循环变量的类型是表达式或集合的元素类型
 * 循环变量的作用域一直持续到循环结束
 * @author: huanghongbo
 * @date: 2020-09-22 20:25
 **/
object ForDemo {

  def main(args: Array[String]): Unit = {
    //for 基本结构,使用to实现左右两边闭合访问区间[1,10]
    for (i <- 1 to 10) {
      println(s"i = $i")
    }
    // for基本结果，使用until实现左闭右开的区间[0,10)
    for (i <- 1 until 10) {
      println(s"i = $i")
    }
    // 双重循环，相当于Java中的嵌套循环，条件之间用分号分割
    println("============双重循环=============")
    for (i <- 1 to 3; j <- 1 to 5) {
      println(i * j)
    }
    println("============循环中使用变量=============")
    for (i <- 1 to 4; j = 4 - i) {
      println(i * j)
    }
    println("============守卫式，增加if条件语句=============")
    //注意if前面没有分号
    for (i <- 1 to 10; j <- 1 to 10 if i == j) {
      println(s" i * j = $i * $j = ${i * j}")
    }
    println("============推导式，使用yield接受返回结果=============")
    // 如果for循环中的循环体是以yield开始，那么此循环会构造除一个集合，每次迭代生成集合中的一个值。
    //可以使用变量接受产生的新集合
    val result = for (i <- 1 to 5) yield i % 2
    result.foreach(println(_))
    println("============九九乘法表=============")
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$j * $i = ${j * i}\t")
      if (j == i) println()
    }
    println("============for循环中使用大括号=============")
    for {
      i <- 1 to 3
      from = 4 - i
      j <- from to 3
    }
      println(s" i = $i,j = $j")
    println("============for循环遍历字符串=============")
    val message = "scala"
    for (elem <- message) println(elem)
  }

}
