package hhb.cn.part09


/**
 * @description:
 * @date: 2020-09-28 23:03
 **/
object SetDemo {

  def main(args: Array[String]): Unit = {

    //创建一个set集合，默认是不可变的set集合
    val set = Set(1, 2, 3, 4, 5, 6)
    set.removedAll(Array(1))
    //由于是不可变集合，无法删除
    println(set)

    //创建一个可变Set集合
    import scala.collection.mutable.Set

    val mutableSet = Set[Int]()
    println(mutableSet)
    mutableSet.add(1)
    mutableSet.addAll(Array(2, 3, 4, 5, 1))
    println(mutableSet)

    mutableSet.remove(1)
    println(mutableSet)

    //通过是有 += -= 进行增加删除操作
    mutableSet += 8
    println(mutableSet)
    mutableSet -= 2
    println(mutableSet)

    //对set集合进行交集的操作,可是使用&符合或intersect
    println(Set(1, 2, 3) & Set(2, 3, 4)) // 2,3
    println(Set(1, 2, 3) intersect (Set(2, 3, 4))) // 2,3

    // 对set集合进行去并集的操作( ++ 、 ｜  、 union)，会自动去重
    println(Set(1, 2, 3) ++ Set(2, 3, 4)) //1，2，3，4
    println(Set(1, 2, 3) | Set(2, 3, 4)) //1，2，3，4
    println(Set(1, 2, 3) union Set(2, 3, 4)) //1，2，3，4

    //对Set集合进行取差集的操作（ --  &～  diff）
    // 是将两个集合中的相同的元素，从第一个集合中删除掉，第一个集合剩下的元素就是取差集的结果
    println(Set(1, 2, 3) -- Set(2, 3, 4)) //1
    println(Set(1, 2, 3) &~ Set(2, 3, 4)) //1
    println(Set(1, 2, 3) diff Set(2, 3, 4)) //1
  }
}
