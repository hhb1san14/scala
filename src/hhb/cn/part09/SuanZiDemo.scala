package hhb.cn.part09

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-29 16:22
 **/
object SuanZiDemo {

  def main(args: Array[String]): Unit = {

    //map\forEach\mapValues
    val list = (1 to 10).toList
    list.foreach(elem => print(elem + " \t"))
    list.foreach(print(_))
    list.foreach(print)
    println(list.map(_ > 2))
    println(list.map(_ + 2))

    // Range(20, 0, -2)用给定的步长值设定一个范围，从开始到结束(不包含)。
    val index = Range(20, 0, -2).zipWithIndex
    val map = index.toMap
    println(map)

    //将map中的值+100
    println(map.map(x => (x._1, x._2 + 100)))
    println(map.map { case (key, vale) => (key, vale + 100) })
    println(map.mapValues(_ + 100).toMap)


    val list1 = List(List(1, 2, 5, 6), List(3, 4))
    println(list1.flatten)
    // flatten 把一个字符串的集合展开为一个字符集合，因为字符串本身就是字符的集合
    val list2 = List("Java", "Hadoop")
    println(list2.flatten)
    // flatten 有效的处理 Some 和 None 组成的集合。它可以展开Some元素形成一个新的集合，同时去掉None元素
    val array = Array(Some(1), None, Some(2), None)
    println(array.flatten.toBuffer)
    // 方法很多，flatten最简单
    val ints = array.collect { case Some(i) => i }
    println(ints.toBuffer)
    println(array.filter(!_.isEmpty).map(_.get).toBuffer)

    // 将 list1 中每个元素乘2，最后作为一个集合返回
    println(list1.flatten.map(_ * 2))
    println(list1.flatMap(x => x.map(_ * 2)))
    println(list1.flatMap(_.map(_ * 2)))

    // 将字符串数组按空格切分，转换为单词数组
    val lines = Array("Apache Spark has an advanced DAG execution engine",
      "Spark offers over 80 high-level operators")

    println(lines.map(_.split(" ")).flatten.toBuffer)
    println(lines.flatMap(_.split(" ")).toBuffer)

    val chars = Array('a', 'b', 'c')
    val newchars = chars.collect(fun)
    println("newchars:" + newchars.mkString(","))


    val list3 = (1 to 10).toList
    println(list3.reduce(_ + _))
    sortNum()
  }

  val fun: PartialFunction[Char, Char] = {
    case 'a' => 'A'
    case x => x
  }

  def sortNum(): Unit = {
    val list = List(1, 9, 3, 8, 6, 5)

    val sortedList = list.sorted
    println(list)
    println(sortedList)

  }


}

