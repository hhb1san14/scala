package hhb.cn.part01

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-22 18:30
 **/
object ReadLinePrintDemo {

  def main(args: Array[String]): Unit = {

    print("请输入你的姓名：")
    val name = scala.io.StdIn.readLine()
    print("请输入你的年龄：")
    val age = scala.io.StdIn.readInt()

    println("你的姓名：" + name + " ,你的年龄: " + age)
    printf("你的姓名：%s ,你的年龄: %d", name, age)
    println()
    println(s"你的姓名：$name ,你的年龄: $age")
  }

}
