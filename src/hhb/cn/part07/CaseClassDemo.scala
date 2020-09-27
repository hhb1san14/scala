package hhb.cn.part07


class Amount

//
//样例类中主构造器的参数默认用val修饰
//样例类中自动身材apply方法
case class Test() extends Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object Nothing extends Amount


object CaseClassDemo {


  def main(args: Array[String]): Unit = {
    judgeIdentity(Dollar(10.0))
    judgeIdentity(Currency(10.0, "123"))
    judgeIdentity(Nothing)
    judgeIdentity(Test())

  }

  /**
   * 样例类匹配
   *
   * @param amount
   */
  def judgeIdentity(amount: Amount): Unit = {
    amount match {
      case Dollar(value) => println("Dollar类型")
      case Currency(value, unit) => println("Currency类型")
      case Nothing => println("Nothing类型")
      case Test() => println("test")
    }
  }
}
