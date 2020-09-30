package hhb.cn.part09

import scala.collection.mutable

/**
 * @description:
 * @date: 2020-09-28 22:43
 **/
object QueueDemo {

  def main(args: Array[String]): Unit = {

    val queue = new mutable.Queue[Int]()
    println(queue)

    //添加一个元素
    queue += 1

    //向队列中添加一个集合
    queue ++= List(2, 3, 4)

    //获取第一个元素并删除
    val dequeue = queue.dequeue()
    println(dequeue)
    println(queue)

    //再次向队列中添加元素
    queue.enqueue(5,6,7)

    //获取第一个元素和最后一个元素
    println(queue.head)
    println(queue.last)

  }

}
