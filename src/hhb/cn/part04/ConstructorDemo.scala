package hhb.cn.part04


//主构造器与类名交织在一起，类名后面的参数就是主构造器的参数
//主构造器直接在类中，其代码不包含在任何方法中
class Animal(name: String, age: Int) {
  //下面三行代码也属于主构造器的方法
  println(name)
  println(age)
  println("=================================")

  var gender: String = ""

  def this(name: String, age: Int, gender: String) {
    //在类中，每个辅助构造器必须以主构造器或其他辅助构造器的调用作为第一行代码
    this(name, age)
    this.gender = gender
  }

  var color: String = ""

  def this(name: String, age: Int, gender: String, color: String) {
    //此处调用的是其他构造器
    this(name, age, gender)
    this.color = color
  }


}


object ConstructorDemo {

  def main(args: Array[String]): Unit = {

    val animal1 = new Animal("啦啦1", 5)
    val animal2 = new Animal("啦啦2", 6,"公")
    val animal3 = new Animal("啦啦3", 7,"公","红色")


  }

}
