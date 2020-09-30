package hhb.cn.part10


class SpecialPerson(var name: String) {}

class Older(val name: String)

class Worker(name: String)

class Student(val name: String)

object ImplicitDemoThree {


  def SpecialBuyTick(specialPerson: SpecialPerson) = {
    if (specialPerson != null)
      println(specialPerson.name + " 购买了特殊票")
    else
      println("不能买")
  }

  //定义一个隐式转换函数
  implicit def anyToSpecial(any: Any): SpecialPerson = {
    any match {
      case any: Older => new SpecialPerson(any.asInstanceOf[Older].name)
      case any: Student => new SpecialPerson(any.asInstanceOf[Student].name)
      case _ => null
    }
  }

  def main(args: Array[String]): Unit = {
    val older = new Older("older")
    val student = new Student("student")
    val worker = new Worker("worker")

    SpecialBuyTick(older)
    SpecialBuyTick(student)
    SpecialBuyTick(worker)


  }

}
