package hhb.cn.part05


class Person2

class Student2 extends Person2


object InstanceDemo {

  def main(args: Array[String]): Unit = {
    val p: Person2 = new Student2
    var s: Student2 = null
    //如果对象s 是一个null，isInstanceOf返回是false
    println(s.isInstanceOf[Student2])

    // 判断对象p是不是Student2这个类型
    if (p.isInstanceOf[Student2]) { // true
      //把p这个对象转化为Student2类型后赋值给s
      s = p.asInstanceOf[Student2]
    }
    // 输出s是否是Student2
    println(s.isInstanceOf[Student2]) // true

    //此时p已经是Student2类型
    println(p.getClass == classOf[Person2]) //false
    println(p.getClass == classOf[Student2]) // true


    println("-================================")

    p match {
      case s: Student2 => println("它是Student2类型的对象")
      case _ => println("它什么也不是")
    }

  }

}
