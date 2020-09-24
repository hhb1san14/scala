package hhb.cn.part04

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-24 14:09
 **/

object Object {
  println("这是一个单例对象！！！")

  def printInfo: Unit = {
    println("Hello Scala Object")
  }
}

object ObjectDemo {

  def main(args: Array[String]): Unit = {
    // 只会输出一次这是单例对象
    //    val object1 = Object
    //    val object2 = Object
    // 同样只会输出一次这是单例对象
    Object.printInfo
    Object.printInfo

  }

}
