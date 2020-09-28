package hhb.cn.part08

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-28 14:14
 **/
object HighFunction {

  def main(args: Array[String]): Unit = {
    //接收一个或多个函数作为输入的高阶函数
    val func = n => "*" * n
    println(func(5))

    (1 to 5).map(func(_)).foreach(println(_))


    //输出一个函数的高阶函数

    val urlBuilder = (flag: Boolean, domain: String) => {
      val http = if (flag) "https://" else "http://"
      (requestUrl: String, param: String) => (s"$http$domain/$requestUrl?$param")
    }

    val getUrl = urlBuilder(true, "www.baidu.com")
    val str = getUrl("sdf", "id=1")
    println(str)

    def getUrl2 = urlBuilder(true, "www.baidu.com")

    val url = getUrl2("sdf", "id=1")
    println(url)

    def f2(n: Int): String = {
      "*" * n
    }

//    def f2(n: Int): String = {
//      n * "*"
//    }
  }

  //  def f(n: Int): String = {
  //    n * "*"
  //  }

}
