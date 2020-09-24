package hhb.cn.part03

import scala.collection.mutable.ArrayBuffer

/**
 * @description:数组
 * 在Scala中，分为定长数组和可变数组
 * 定长数组：Array，长度是不变的
 * 变长数组：ArrayBuffer，长度是可变的，等效于Java中的ArrayList
 * 使用数组之前，需要导入包 scala.collection.mutable.ArrayBuffer
 * @author: huanghongbo
 * @date: 2020-09-23 15:09
 **/
object ArrayDemo {

  def main(args: Array[String]): Unit = {
    println("===========定长数组=============")
    //定义长度为10的整型定长数组，初始值为0
    val nums = new Array[Int](10)

    //定义长度为10的字符串型定长数组，初始值为 null
    val strs = new Array[String](10)

    //通过索引访问数组元素，索引从0开始，使用 () 而不是 []
    println(strs(0))

    //省略了关键词new，那么Scala会进行自动类型推断
    val arrays: Array[Int] = Array(1, 2, 3, 4, 5)
    val arrays2: Array[Nothing] = Array()
    println(arrays.length)

    //通过toArray快速定义数组，用于测试
    val array = (1 to 10).toArray

    println("===========变长数组=============")
    //定义一个空的Int变长数组
    //注意，后面要有小括号
    val arrayBuffer = ArrayBuffer[Int]()
    //通过+= 在尾端添加一个或者多个元素
    arrayBuffer += 1
    arrayBuffer += (2, 3, 4, 5)
    //通过 ++= 在尾端添加集合
    arrayBuffer ++= (6 to 10).toArray
    arrayBuffer.foreach(println(_))
    println("========================")

    // 还可通过 -= 和 --= 对变长数组进行删减
    arrayBuffer -= 10
    arrayBuffer --= (1 to 5).toArray
    arrayBuffer.foreach(println(_))
    println("========================")
    //使用append 追加元素
    arrayBuffer.append(1)
    arrayBuffer.appendAll(Array(1, 2, 3))
    arrayBuffer.foreach(println(_))

    println("========================")
    //使用insert 在某个索引之前插入元素
    arrayBuffer.insert(0, 0)
    arrayBuffer.insertAll(1, Array(8, 9, 10))
    arrayBuffer.foreach(println(_))
    println("========================")
    //移除元素
    //移除最后N个元素
    arrayBuffer.trimEnd(3)
    arrayBuffer.foreach(println(_))
    println("========================")
    //移除最开始的N个元素
    arrayBuffer.trimStart(2)
    arrayBuffer.foreach(println(_))
    println("========================")

    // 通过remove 从某个索引处移除一个或多个元素
    arrayBuffer.remove(3)
    arrayBuffer.remove(2, 4)
    arrayBuffer.foreach(println(_))
    println("========================")
    //使用 toArray把变长数组转换成定长数组
    val array1 = arrayBuffer.toArray
    //使用toBuffer把定长数组转换成变长数组
    val buffer = array1.toBuffer
    println("========================")

    //使用until进行数组遍历
    for (i <- 0 until arrayBuffer.length) {
      println(arrayBuffer(i))
    }
    //使用to进行数组遍历
    for (i <- 0 to arrayBuffer.length - 1) {
      println(arrayBuffer(i))
    }
    // 使用增加的for循环进行数组遍历
    for (ele <- arrayBuffer) println(ele)
    //使用forEach进行数组遍历
    arrayBuffer.foreach(println(_))

  }

}
