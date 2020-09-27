package hhb.cn.part07


object OptionDemo {

  val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)

  def getScore(name: String): Int = {

    val score: Option[Int] = map.get(name)
    score match {
      case Some(score) => score
      case None => -1
    }
  }

  def main(args: Array[String]): Unit = {
    println(getScore("a"))
    println(getScore("d"))
  }

}
