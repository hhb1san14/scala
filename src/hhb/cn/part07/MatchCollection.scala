package hhb.cn.part07

object MatchCollection {

  def main(args: Array[String]): Unit = {

    //对Array数组进行匹配，分别匹配：带有指定个数元素的数组、带有指定元素的数组、以某个元素开头的数据
    //    val array = Array(1, 3, 5, 7, 9) // 这是一个其他数组
    //val array = Array(1, 3, 5) //这是一个指定长度为3的数组，并且第一个元素为1，x y 分别为 ：3   5
    //    val array = Array(1) //这是一个指定长度只有1的数组，而且元素就是1
    val array = Array(2) // 这是一个其他数组
    array match {
      case Array(1, x, y) => println(s"这是一个指定长度为3的数组，并且第一个元素为1，x y 分别为 ：$x   $y")
      case Array(1) => println("这是一个指定长度只有1的数组，而且元素就是1")
      case Array(1, _*) => println("这是一个以1开头的数组")
      case _ => println("这是一个其他数组")
    }


    //对List集合进行匹配，分别匹配：带有指定个数元素的列表、带有指定元素的列表、以某个元素开头的列表、以某个元素结尾
    //    val list = List(1, 3, 4, 5)  // 这是一个以1开头的元素
    //    val list = List(1, 3) // 这个一个有指定个数元素的列表，1  3
    //    val list = List(1) // 这是一个指定长度只有1的列表，而且元素就是1
    val list = List(4, 4, 2) // 其他
    list match {
      case x :: y :: Nil => println(s"这个一个有指定个数元素的列表，$x  $y")
      case 1 :: Nil => println("这是一个指定长度只有1的列表，而且元素就是1")
      case 1 :: tail => println("这是一个以1开头的元素")
//      case init :: 2 => println("这是一个以2结尾的元素")
      case _ => println("其他")
    }


    //对元组进行匹配
    var tuple = (2, 3, 2)
    tuple match {
      //以1开头，包含三个元素的元组
      case (1, x, y) => println(s"$x   $y")
      //以1结尾，包含三个元素的元组
      case (x, _, 1) => println(s"$x  ")
      case _ => println("其他")
    }

  }

}
