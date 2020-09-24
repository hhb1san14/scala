package hhb.cn.part01

/**
 * @description: {}就是块表达式，可以包含一系列表达式块中的最后一个表达式的值就是整个块的值
 * @author: huanghongbo
 * @date: 2020-09-22 18:23
 **/
object BlockDemo {


  def main(args: Array[String]): Unit = {

    val x1 = 1
    val y1 = 2
    val x2 = 3
    val y2 = 4

    val distance = {
      val dx = x2 - x1
      val dy = y2 - y1

      math.sqrt(dx * dx + dy * dy)
    }

    println(distance)

    var y = 0;
    val x = y = 1
    println("x ==>" + x + ",y==>" + y)
  }

}
