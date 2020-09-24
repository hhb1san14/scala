package hhb.cn.part04

/**
 * @description:
 * 在Scala中，类都有一个无参构造器
 * @author: huanghongbo
 * @date: 2020-09-24 10:05
 **/

class Person {

  //声明字段必须进行初始化，Scala编译器会根据初始化值的数据类型自动推断字段类型，字段类型可以省略
  var name = "huanghongbo"

  // _ 下划线表示一个占位符，编译器会根据变量的数据类型赋予相应的初始值
  //使用 _ 占位符进行赋初始值的时候，数据类型必须指定
  var nickName: String = _
  var age: Int = _
  var numDouble: Double = _
  var flag: Boolean = _
  // 使用val修饰的变量不能使用占位符
  //  val test:Int = _
  val num = 30
  var a = 20
  //如果对String类型赋值为null，必须指定类型，否则默认类型为Null
  var address: String = null
  // 类中的私有字段，有私有的getter 和 setter方法
  // 可以在类的内部访问，也可以被其伴生对象访问
  private var hobby = "旅游"
  //对象的私有字段，访问权限更小，只能在当前类中访问
  private[this] var cardInfo = "10010"

  def hello(message: String): Unit = {
    //只能在当前类中访问cardInfo
    println(s"$message   , $cardInfo    ,   $hobby")
  }

  //自定义方法实现两个数据求和
  def addNum(num1: Int, num2: Int): Int = {
    num1 + num2
  }

}

object ClassDemo {
  def main(args: Array[String]): Unit = {
    //使用无参构造器创建对象，小括号可以省略
    val person = new Person()
    var p = new Person
    println(s"${person.name}     ${person.nickName}     ${person.age}     ${person.numDouble}      ${person.flag}")
    //给类的属性赋值
    person.age = 50
    //注意：这种方式赋值其实就是调用 age_= 这个setter方法
    person.age_=(20)
    //这种就是调用了他的getter方法
    println(person.age)
    //调用类中的方法
    person.hello("你好")
    println(person.addNum(1, 3))
    //无法调用类中的私有字段和对象的私有字段
    //    person.hobby
    //    person.cardInfo

  }
}
