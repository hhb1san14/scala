package hhb.cn.part04

/**
 *
 */

class Student(name: String, age: Int) {

  private var gender: String = _

  def sayHi: Unit = {
    println(s"大家好，是$name , 年龄 $age, $gender 生")
  }

}


object Student extends App {


  def apply(name: String, age: Int): Student = new Student(name, age)

  //直接使用class类名(参数……) 这种方式隐式调用伴生对象中apply方法创建class Student 对象
  val student = Student("zhangs", 20)

  //伴生类和伴生对象可以相会访问私有成员
  student.gender = "男"

  student.sayHi

}
