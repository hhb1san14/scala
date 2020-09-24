package hhb.cn.part05

class person(name: String, age: Int) {
  println("这是父类构造器！")
}

//默认的类构造器属性是val，只有getter方法，stuNo使用var修饰，所以有getter setter方法
class Student(name: String, age: Int, var stuNo: String) extends person(name, age) {
  println("这是子类构造器")
}

object ExtendsDemo {

  def main(args: Array[String]): Unit = {
    val student = new Student("张三", 20, "1001")
    student.stuNo = "1002"

    println(student.stuNo)

  }
}
