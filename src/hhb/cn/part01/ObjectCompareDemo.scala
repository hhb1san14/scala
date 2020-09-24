package hhb.cn.part01

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-22 19:05
 **/
object ObjectCompareDemo {

  def main(args: Array[String]): Unit = {

    println(1 == 1) // true
    println(1 != 2) // true
    println(1 == 2) // false

    val flag = List(1, 2, 3) == List(4, 5, 6)
    println(flag) // false

    println(List(1, 2, 3) != Array(1, 2, 3)) // true

    println(2 == 2.0) // true
    println(List(1, 2, 3) == "Scala")  // false


  }

}
