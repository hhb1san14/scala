package hhb.cn.part03

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-23 21:17
 **/
object OperatorDemo {


  def main(args: Array[String]): Unit = {
    //将数组中的偶数加倍，奇数丢弃
    val nums = 1 to 10
    val array1 = for (num <- nums if num % 2 == 0) yield num * 2
    val array2 = for (num <- nums) yield if (num % 2 == 0) num * 2 else 0
    array1.foreach(println(_))
    println("===================")
    array2.foreach(println(_))
    println("===================")
    //使用scala高阶函数
    nums.filter(_ % 2 == 0).map(_ * 2).foreach(println(_))
    println("===================")
    //取出数组中的第一个元素
    println(nums.head)
    //取出数组中的最后一个元素
    println(nums.end)
    //取出数组中除了第一个剩下的所有元素
    println(nums.tail.toBuffer)
    //取出数组中除了最后一个剩下的所有元素
    println(nums.init.toBuffer)

    //求和
    println(nums.sum)
    //求最大值
    println(nums.max)
    //求最小值
    println(nums.min)

    val nums2 = Array(2, 1, 4, 3)
    //排序
    println(nums2.sorted.toBuffer)
    //数组的元素相乘
    println(nums2.product)

    val nums3 = Array(2, 1, 4, 3, 1, 2, 3)
    //把数组里面的每一个元素都乘2
    println(nums3.map(_ * 2).toBuffer)
    //对数组所有的元素进行累加
    println(nums3.reduce(_ + _))
    //对数组进行去重
    println(nums3.distinct.toBuffer)
    //求数组长度
    println(nums3.length)
    println(nums3.size)
    //获取每个元素的索引
    println(nums3.indices)
    //使用mkString进行输出
    //输出元素，且元素与元素之间使用&分割
    println(nums3.mkString(" & "))
    // //输出元素，以 < 开头，以 > 结尾，且元素与元素之间使用&分割
    println(nums3.mkString("<", " & ", ">"))

    //count基数，注意：count后面必须有条件
    //统计数组中大于2的数量
    println(nums3.count(_ > 2))
    //统计数组中偶数的数量
    println(nums3.count(_ % 2 == 0))

    //filter:过滤出符合条件的参数，filterNot：过滤出不符合条件的参数
    //过滤出所有大于2的
    println(nums3.filter(_ > 2).toBuffer)
    //过滤出所有奇数
    println(nums3.filterNot(_ % 2 == 0).toBuffer)
    println("=========================")

    //提取前N个元素
    println(nums3.take(3).toBuffer)
    //提取后N个元素
    println(nums3.takeRight(4).toBuffer)
    //从左向右开始提取，提取符合条件的元素，如果条件不成立，则终止
    println(nums3.takeWhile(_ < 4).toBuffer)

    println("=========================")
    //删除前N个元素
    println(nums3.drop(3).toBuffer)
    //删除后N个元素
    println(nums3.dropRight(4).toBuffer)
    //从左向右开始删除，提取符合条件的元素，如果条件不成立，则终止
    println(nums3.dropWhile(_ < 4).toBuffer)
    println("=========================")
    //将数组分为两部分，前N个为一部分，剩下的为一部分
    val tuple = nums3.splitAt(3)
    println(tuple._1.toBuffer + ",,," + tuple._2.toBuffer)
    //将数组进行节前，以索引为2开始，到4结束，不包括第五个
    println(nums3.slice(2, 5).toBuffer)
    println("=========================")

    //对数组进行拉链操作
    val array_1 = Array("A", "B", "C")
    val array_2 = Array(1, 2, 3, 4)
    //拉链操作，当两个数组长度不一样时，截取相同长度
    val newArray: Array[(String, Int)] = array_1.zip(array_2)
    println(newArray.toBuffer)
    //拉链操作，当两个数组长度不一样时，array_1 用*填充，array_2用-1填充
    val newArray2: Array[(String, Int)] = array_1.zipAll(array_2, "*", -1)
    println(newArray2.toBuffer)

    //拉链操作，当两个数组长度不一样时，array_1 用 -1 填充，array_2用 * 填充
    val newArray3 = array_2.zipAll(array_1, "*", -1)
    println(newArray3.toBuffer)
    //用数组索引进行填充
    val newArray4 = array_1.zipWithIndex
    println(newArray4.toBuffer)
    println("=========================")
    //使用unzip进行数组拆分

    val (l1, l2) = newArray4.unzip
    println(l1.toBuffer)
    println(l2.toBuffer)

    val unzip = Array((1, "one", '1'), (2, "two", '2'), (3, "three", '3')).unzip3
    println(unzip._1.toBuffer)
    println(unzip._2.toBuffer)
    println(unzip._3.toBuffer)

    //数组的操作符： :+  +: ++
    //:+ 在数组的尾部加入元素
    //+: 在数组的头部加入元素
    //++ 拼接两个数组
    val num1 = (1 to 5).toArray
    val num2 = (6 to 9).toArray
    val num3 = num1 :+ 10
    val num4 = 10 +: num2
    val num5 = num1 ++ num2
    println(num3.toBuffer)
    println(num4.toBuffer)
    println(num5.toBuffer)
    println("=========================")
    //排序
    val numSort = Array(1, 5, 2, 6, 3, 7, 4, 9, 8)
    //升序
    println(numSort.sorted.toBuffer)
    println(numSort.sortWith(_ < _).toBuffer)
    //降序
    println(numSort.sorted.reverse.toBuffer)
    println(numSort.sortWith(_ > _).toBuffer)
  }

}
