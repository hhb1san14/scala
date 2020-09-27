package hhb.cn.part07

import scala.util.Random

object MatchDemo {

  def main(args: Array[String]): Unit = {
    val carStr = '6'
    carStr match {
      //只要有一个匹配上就会直接返回，不需要break。
      case '+' => println("11111111111")
      case '-' => println("22222222222")
      case '*' => println("33333333333")
      case '/' => println("44444444444")
      //这个表示上面的都没有匹配上，输出other，类似Java中default
      case _ => println("other")
    }
    val arr = Array("Hadoop", "Zookeeper", "Spark", "Scala")
    val project = arr(Random.nextInt(arr.length))
    println(project)
    project match {
      case "Hadoop" => println("this is Hadoop")
      case "Zookeeper" => println("this is Zookeeper")
      case "Spark" => println("this is Spark")
      case _ => println("Other")
    }

    println("====================")
    //守卫式匹配，添加if 判断
    val c = '/'
    val num = c match {
      case '+' => 1
      case '-' => 2
      case _ if c.equals('*') => 3
      case _ => 4
    }
    println(num)

    println("====================")

    val result = typeMatch(Array(1,2,"3"))
    println(result)
  }


  //匹配类型语法： case 变量 : 类型 => 代码
  def typeMatch(x: Any): Int = {
    x match {
      case x: String => println("这是一个字符串类型")
        1
      case x: Int => println("这是一个整型类型")
        2
      case x: Boolean if x == false => println("这是布尔类型的false")
        3
      case x: Array[Int] => println("这是一个整型数组")
        4
      case _ => println("不知道是什么类型")
        5
    }

  }


}
