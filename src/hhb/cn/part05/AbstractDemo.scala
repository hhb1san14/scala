package hhb.cn.part05


abstract class Person(name: String, age: Int) {
  def talk: Unit
}

class Teacher(name: String, age: Int, workNo: String) extends Person(name, age) {
  //重写抽象类的walk方法，可以不加override方法
  def talk: Unit = {
    println("重写父类的方法")
  }
}

object AbstractDemo {

  def main(args: Array[String]): Unit = {
    val teacher = new Teacher("张三", 20, "123")
    teacher.talk
  }

}
