package hhb.cn.part10


class Num{}


class RichNum(num: Num) {
  def rich(): Unit = {
    println("============")
  }
}

/**
 * 自定义了一个伴生对象，生成一个apply方法
 */
object RichNum {
  def apply(num: Num): RichNum = {
    new RichNum(num)
  }
}

object ImplicitDemo {
  //定义一个隐式转换函数，命名要符合one2one的命名格式
  implicit def num2RichNum(num: Num): RichNum = {
    RichNum(num)
  }


  def main(args: Array[String]): Unit = {

    val num = new Num
    //num类型并没有rich方法，但是Scala编译器会查找当前范围内的隐式转换函数，
    //然后将其转换成RichNum类型，最终调用rich方法
    num.rich()
  }


}
