package hhb.cn.part09

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-28 22:06
 **/
object ListDemo {

  def main(args: Array[String]): Unit = {

    //Nil 表示一个空列表
    // :: 操作符表示向集合中添加元素，它是从右向左运算的，所以空集合一定放在最右边
    val list1 = 1 :: 2 :: 3 :: 4 :: Nil
    val list2 = 5 :: 6 :: 7 :: 8 :: Nil
    // 使用 ::: 将两个集合拼接起来
    val list3 = list1 ::: list2 // List(1, 2, 3, 4, 5, 6, 7, 8)
    val list4 = list1 :: list2 // List(List(1, 2, 3, 4), 5, 6, 7, 8)
    println(list3)
    println(list4)

    println(list3.head) //返回第一个元素
    println(list3.tail) //返回除了一个元素之外的所有元素
    println(list3.init) // 返回除了最后一个的所有元素
    println(list3.last) // 返回最后一个元素

    val list = List(5, 1, 3, 6, 2, 5, 7, 0)
    println(quickSort(list))
  }

  //递归，快排
  def quickSort(list: List[Int]): List[Int] = {
    list match {
      case Nil => Nil
      case head :: tail =>
        // 使用partition 方法，把list集合分为两个部分，第一个部分小于head，第二个部分大于head
        val tuple: (List[Int], List[Int]) = tail.partition(_ < head)
        //让小于head的部分放在头部，把head放到大于head的集合中，组成一个新的集合
        quickSort(tuple._1) ::: head :: quickSort(tuple._2)
      //        val value = head :: Nil
      //        quickSort(tuple._1) ::: value ::: quickSort(tuple._2)
    }
  }

}
