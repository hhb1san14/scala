package hhb.cn.part09

/**
 * @description:
 * @date: 2020-09-29 14:08
 **/
object MapDemo {

  def main(args: Array[String]): Unit = {
    //使用两种方式创建不可变的Map

    val map1 = Map("a" -> 1, "b" -> 2)
    val map2 = Map(("a", 1), ("b", 2))

    map1.keys.foreach(println(_))
    map1.values.foreach(println(_))

    println(map1("b"))
    //如果访问不存在的Key的时候，抛出异常
    //    println(map1("c"))

    //使用get方法，获取与key对应的value值
    //get方法会返回一个Option对象，要么是some（有值），要么是none(无值)
    println(map1.get("b"))
    println(map1.get("c"))
    val num = map1.get("a")
    num match {
      case None => println("Null")
      case Some(x) => println(x)
    }

    //使用getOrElse方法,获取key值对应的value的值，如果不存在，返回默认值
    println(map1.getOrElse("c", 0))
    println(map1.getOrElse("b", 0))


    //创建一个可变的Map
    val map3 = scala.collection.mutable.Map("a" -> 1, "b" -> 2)
    println(map3)
    map3("a") = 10
    println(map3)
    map3("c") = 3
    println(map3)
    //使用+= -= 添加删除操作
    map3 += ("d" -> 4, "f" -> 5)
    println(map3)
    map3 -= ("d", "f")
    println(map3)

    //将key与value的值互换
    val map4 = for ((k, v) <- map3) yield (v, k)
    println(map4)

    //第二中方式将key和value互换
    //推荐使用该方式将key和value进行互换
    val map5 = map3.map(x => (x._2, x._1))
    println(map5)

    //通过拉链操作创建Map
    var a = Array(1, 2, 3)
    val b = Array("a", "b", "c")
    val c: Array[(Int, String)] = a.zip(b)
    val map6 = a.zip(b).toMap
    println(map6)
  }
}
