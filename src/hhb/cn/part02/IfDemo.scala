package hhb.cn.part02

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-22 20:13
 **/
object IfDemo {

  def main(args: Array[String]): Unit = {

    val num = 20

    if (num > 20) "张三" else "李四"

    if (num > 20) 0 else if (num == 20) 1 else 0

    //因为if else 有返回值，那么可以直接将if else语句赋值给一个变量
    // if else 语句的返回值，不需要加return
    val name = if (num > 20) "张三" else "李四"

    //如果if else 语句中，两个返回值类型不一样
    //此时Scala会自动推断出两者的公共父类型，然后将公共父类型作为表达式的返回值类型
    var name2: Any = if (num == 20) "张三" else 100

    //如果if else 语句中，缺省else语句块，那么默认else的值就是Unit
    // Unit用（）表示，类似Java中的void
    val name3 = if (num == 20) "王武"
    //name3 与 name4等同
    val name4 = if (num == 20) "王武" else ()
  }

}
