package hhb.cn.part08

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-28 17:32
 **/
object PartialFunctionDemo {


  def main(args: Array[String]): Unit = {

    val partial = new PartialFunction[Any, Int] {
      //如果返回true，就调用apply方法
      override def isDefinedAt(x: Any): Boolean = {
        println(x.toString)
        x.isInstanceOf[Int]
      }

      // apply构造器，对传入值+1，并返回
      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }

    val list = List(1, "Hadoop", "Spark", '2', true, 10.0, 20)
    list.collect(partial).foreach(println(_))


    //快捷办法
    list.collect { case x: Int => x + 1 }.foreach(println(_))

  }


}
