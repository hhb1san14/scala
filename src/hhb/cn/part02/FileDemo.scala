package hhb.cn.part02

import java.io.PrintWriter

import scala.io.Source

/**
 * @description:I/O
 * I/O操作是一门编程语言的重要内容
 * 相比于Java语言中的IO类，Scala中的IO类较少，比较常用的是Source这个类
 * 在Scala中，更多的是调用Java中的IO或通过Java中的IO进行相对应的封装来实现IO操作
 * @author: huanghongbo
 * @date: 2020-09-23 14:05
 **/
object FileDemo {

  def main(args: Array[String]): Unit = {
    readTextFile
    println("===============")
    readNetSource
    println("===============")
    readNetSource2
    println("===============")
    writeTxt
  }

  /**
   * 读取文本文件
   */
  def readTextFile: Unit = {
    val source = Source.fromFile("/Users/baiwang/myproject/scala/src/test.txt")
    val values: Iterator[String] = source.getLines()
    for (value <- values)
      println(value)
    //关闭IO
    source.close()
  }

  /**
   * 读取网络资源
   */
  def readNetSource: Unit = {
    val source = Source.fromURL("https://www.baidu.com")
    //将资源转换成字符串
    val value = source.mkString
    println(value)
    source.close()
  }

  /**
   * 读取网络资源
   */
  def readNetSource2: Unit = {
    val source = Source.fromURL("https://www.baidu.com")
    //将资源转换成字符串
    val values = source.getLines()
    for (value <- values) {
      println(value)
    }
    for (i <- 1 until 10) {

    }

    source.close()
  }

  /**
   * 写入文本文件
   * Scala中，没有内建的对应写入文件的支持，需要使用java.io.PrintWriter来实现
   */
  def writeTxt: Unit = {

    val writer = new PrintWriter("/Users/baiwang/myproject/scala/src/write.txt")
    for (i <- 1 to 10) {
      //写入文件内容
      writer.println(s"i = $i")
      //刷新缓冲区
      writer.flush()
    }
    writer.close()
  }

  def test(): String = ""


}
