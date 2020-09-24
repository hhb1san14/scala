package hhb.cn.part04

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-24 10:48
 **/
class Dog {

  private var _leg = 0

  private var test1 = 0
  var test2 = 0

  //自定义getter方法
  def leg: Int = _leg

  //自定义setter方法
  def leg_=(newLeg: Int) {
    _leg = newLeg
  }

}

object GetterAndSetterDemo {

  def main(args: Array[String]): Unit = {
    val dog = new Dog
    //调用自定义的setter方法
    dog.leg_=(10)
    //调用自定义的getter方法
    println(dog.leg)

    //私有的属性不自定义setter方法，直接使用报错
    //    dog.test1_=(1)
    dog.test2_=(1)
//    println(dog test2)
  }

}
