package hhb.cn.part04

//伴生类和伴生对象在一个文件中，文件名相同
/**
 * 伴生类
 */
class ClassObject {

  private var name = "hhb"

  private[this] var a = "sdf"

  def printInfo: Unit = {
    //在伴生类中可以访问伴生对象的私有成员
    println(ClassObject.num)
    println("Hello Object!")
  }

}

/**
 * 伴生对象
 */
object ClassObject {
  private var num = 10

  def main(args: Array[String]): Unit = {
    val classObject = new ClassObject
    //在伴生对象中可以访问伴生类的私有成员
    println(classObject.name)
    classObject.printInfo
  }
}

