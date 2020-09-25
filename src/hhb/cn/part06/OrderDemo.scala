package hhb.cn.part06

import scala.util.Sorting


case class Project(tag: String, score: Int) extends Ordered[Project] {


  override def compare(that: Project): Int = {
    tag.compareTo(that.tag)
  }
}


object OrderDemo {

  def main(args: Array[String]): Unit = {
    //字典序
    val list = List(Project("hadoop", 40), Project("flink", 90), Project("hive", 30), Project("kafka", 20))
    println(list.sorted)


    val tuples = Array(("a", 3, 'b'), ("b", 1, 'c'), ("c", 2, 'a'))
    //默认使用第一个字母排序
    Sorting.quickSort(tuples)
    println(tuples.toBuffer)

    //Ordering.by[(String, Int, Char), Int](_._2) 将一个(String, Int, Char)
    // 类型的Tuple元组转换成Int类型，并根据Tuple元组中第二个元素排序
    Sorting.quickSort(tuples)(Ordering.by[(String, Int, Char), Int](_._2))
    println(tuples.toBuffer)
  }
}
