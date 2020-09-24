package hhb.cn.part01

/**
 * @description: scala中的插值器
 * @author: huanghongbo
 * @date: 2020-09-22 18:52
 **/
object InterpolatorDemo {

  def main(args: Array[String]): Unit = {

    // s 插值器可以通过$变量和表达式的值
    val subject = "world"
    val message = s"hello $subject"
    println(message)
    val array = (1 to 10).toArray
    println(s"length :${array.length}")
    println(s"${9 * 10}")

    // f 插值器，用%指定输出格式
    val year = 2020
    val month = 9
    val day = 22
    println(s"$year-$month-$day")
    //以yyyy-MM-dd的方式显示，不足两位用0填充
    println(f"$year-$month%02d-$day%02d")

    // raw插值器，将字符串原样输出
    println("a\n\tc")
    println(raw"a\n\tc")
    println("""a\n\tc""") //这种模式输出与上面raw插值器输出相同

  }

}
