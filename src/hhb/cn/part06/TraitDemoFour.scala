package hhb.cn.part06

class MyUtil {
  def printMessage(name: String): Unit = {
    println("Hello, " + name)
  }
}

trait Log extends MyUtil {
  def sayHi(message: String): Unit = {
    println("Hi, " + message)
  }
}

// MyStudent 继承了Log特质，Log特质继承了MyUtil类，那么MyUtil就成了MyStudent 的父类，继承的传递性
class MyStudent(name: String) extends Log {
  def log(): Unit = {
    println("MyStudent:" + name)
    printMessage(name)
    sayHi(name)
  }
}

object TraitDemoFour {
  def main(args: Array[String]): Unit = {
    val student = new MyStudent("zhangsan")
    student.log()
  }
}
