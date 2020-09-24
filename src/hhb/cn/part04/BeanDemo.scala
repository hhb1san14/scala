package hhb.cn.part04

import scala.beans.BeanProperty

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-24 11:05
 **/
class Teacher {

  @BeanProperty var name: String = _

}

object BeanDemo {

  def main(args: Array[String]): Unit = {

    val teacher = new Teacher
    teacher.name = "张三"
    teacher.name_=("李四")
    println(teacher.name)

    //@BeanProperty 生成的set、get方法
    teacher.setName("王五")
    println(teacher.getName)

  }

}
