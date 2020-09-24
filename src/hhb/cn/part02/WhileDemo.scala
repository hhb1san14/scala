package hhb.cn.part02


/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-23 10:50
 **/
object WhileDemo {
  def main(args: Array[String]): Unit = {
    var num = 1
    while (num < 10) {
      println(s"num = $num")
      num += 1
    }

    println("============do……while===============")
    num = 1
    do {
      println(s"num = $num")
      num += 1
    } while (num < 10)

    println("============使用boolean终止循环===============")
    var flag = true
    num = 1
    while (flag) {
      println(s"num = $num")
      num += 1
      if (num == 5) flag = false
    }
    println("============使用break终止循环===============")
    // 使用breakable 和 break 终止循环，需要导入包
    import scala.util.control.Breaks._
    var res = 0
    breakable {
      for (i <- 1 until 10) {
        if (i == 5) break()
        res += i
      }
    }
    println(res) // 10

    println("============使用return终止循环===============")
    for (i <- 1 to 10) {
      if (i == 5) return
      println(s"i = $i")
    }
  }
}
