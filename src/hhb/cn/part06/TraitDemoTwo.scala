package hhb.cn.part06

trait People {
  val name: String
  val age = 30
  val score: Double = 100

  def eat: Unit = {
    println("Eating........")
  }

  def test
}

trait Worker {
  val age = 20

  def work: Unit = {
    println("Working.........")
  }

}

class Student extends People with Worker {
  //重写抽象字段name，此处override可以省略
  override val name: String = "lisi"
  //由于Worker和People中都有age字段，所以当继承这两个类需要重写age字段，此时override关键字不能省略，否则会报错
  override val age: Int = 25

  override def test: Unit = {
    println("============")
  }
}

object TraitDemoTwo extends App {

  val student = new Student
  student.eat
  student.work
  println(student.name)
  println(student.age)
  println(student.score)
  student.test
}