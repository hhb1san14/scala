package hhb.cn.part03

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-23 22:35
 **/
object DimArrayDemo {

  def main(args: Array[String]): Unit = {
    //创建一个3行4列数据类型为Double的数组
    val array = Array.ofDim[Double](3, 4)
    array(1)(2) = 3.14
    for (i <- 0 to 2; j <- 0 to 3) {
      print(array(i)(j) + "\t")
      if (j == 3) println()
    }
  }
}
