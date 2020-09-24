package hhb.cn.part02

/**
 * @description:在Scala中提供了Lazy的特性
 * 如果将一个变量声明为一个Lazy，那么只有第一次使用这个变量是，变量对应的表达式才会发生计算。
 * 这中特性对于特别耗时的计算操作，特别有用
 * 比如初始化开销比较大的场景 ，对文件进行IO、进行网络IO的操作等
 * @author: huanghongbo
 * @date: 2020-09-23 13:57
 **/
object LazyDemo {

  def main(args: Array[String]): Unit = {
    // 此时启动main方法，直接报错，提示java.io.FileNotFoundException: /User/test.scala (No such file or directory)
    //    val file = scala.io.Source.fromFile("/User/test.scala")

    //此时启动main方法，不会报错，因为根本没有加载文件，只有有调用file变量的时候，才会加载文件
    lazy val file = scala.io.Source.fromFile("/User/test.scala")
    println("OK!")
    //调用file
    file.getLines().size
  }
}
