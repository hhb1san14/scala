package hhb.cn.part05


class Programmer(name: String, age: Int) {

  def coding: Unit = {
    println("我在写代码")
  }
}

class ScalaProgrammer(name: String, age: Int, workNo: String) extends Programmer(name, age) {

  override def coding: Unit = {
    //调用父类的方法
    super.coding

    //增加自己的实现
    println("我在用Scala写代码")
  }
}


object OverrideDemo {

  def main(args: Array[String]): Unit = {
    val scalaProgrammer = new ScalaProgrammer("张三", 20, "1001")
    scalaProgrammer.coding
  }

}
