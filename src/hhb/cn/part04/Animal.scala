package hhb.cn.part04


abstract class Animal {
  def speak
}

class Dog extends Animal {
  override def speak: Unit = {
    println("============")
  }
}

class Cat extends Animal {
  override def speak: Unit = {
    println("+++++++++++")
  }
}

object Animal {

  def apply(message: String): Animal = {
    if (message == "dog") {
      new Dog
    } else {
      new Cat
    }
  }

  def main(args: Array[String]): Unit = {
    val cat = Animal("cat")
    cat.speak

    val dog = Animal("dot")
    dog.speak
  }


}
