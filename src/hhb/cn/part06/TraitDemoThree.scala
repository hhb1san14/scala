package hhb.cn.part06


class Person2 {
  println("Person's Constructor!")
}

trait Logger {
  println("Logger's Constructor!")
}

trait MyLogger extends Logger {
  println("MyLogger's Constructor!")

}

trait TimeLogger extends Logger {
  println("TimeLogger's Constructor!")

}

//如果一个类继承了父类，也继承了特质，要先写父类，在写特质
// extends 父类 with 特质
class Student2 extends Person2 with MyLogger with Logger with TimeLogger {
  println("Student2======")
}


object TraitDemoThree extends App {
  val student = new Student2
}
