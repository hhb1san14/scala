package hhb.cn.part10

object DoublyDemo {

  def print(num: Double)(implicit fmt: String): Unit = {
    println(fmt format (num))
  }

  def main(args: Array[String]): Unit = {

    print(3.1415924)("%.1f")

    implicit val fmtStr1 = "%.3f"
//    implicit val fmtStr2 = "%.4f"
    print(3.1415924)


  }

}
