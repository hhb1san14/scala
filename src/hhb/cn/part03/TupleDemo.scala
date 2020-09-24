package hhb.cn.part03

/**
 * @description:
 * Tuple 元组可以存放不同数据类型的元素
 * 索引是从1开始的，而不是从0开始的
 * 元组在Scala中应用非常广泛，在Spark源码中会经常看见
 * 在Scala中已经事先定义好了22个Tuple，从Tuple1～Tuple22
 * 在Tuple22中最多只能有22个元素
 * @author: huanghongbo
 * @date: 2020-09-23 22:44
 **/
object TupleDemo {

  def main(args: Array[String]): Unit = {
    //定义一个元组
    val tuple1 = (1, 2.5, "spark", 'a', true)
    val tuple2 = (1, 2.5, "spark", 'a', true)
    println(tuple1 == tuple2)
    val tuple3 = (12, 2.5, "spark", 'a', true)
    println(tuple1 == tuple3)
    println(tuple1._3)

    val (t1, t2, t3, t4, t5), t = tuple1
    println(s"$t1  $t2  $t3  $t4  $t5")

    val (l1, _, l3, _, l5), l = tuple1
    println(s"$l1   $l3  $l5")

    //遍历
    for (ele <- tuple1.productIterator) {
      print(ele + "\t")
    }
    println()
    println("==============================")
    tuple1.productIterator.foreach(print(_))
  }


}
