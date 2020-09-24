package hhb.cn.part02

/**
 * @description:
 * @author: huanghongbo
 * @date: 2020-09-23 11:13
 **/
object FunctionDemo {
  def main(args: Array[String]): Unit = {
    println(add(1, 3))
    println("计算阶乘 : " + factorial(5))
    println("斐波那契数列 : " + fibonacci(7))
    println("无返回值 ： " + getSum(1, 1))

    //调用函数式使用函数参数的默认值
    println("默认值 ： " + add2())
    //给函数中参数重新赋值
    println("默认值 ： " + add2(1, 2))
    //不按照参数顺序传递值，而是使用带名参数的方式传值
    println("默认值 ： " + add2(y = 60, x = 50))

    println("变长参数 ： " + addSum(1))
    println("变长参数 ： " + addSum(1, 2, 3))
    println("变长参数 ： " + addSum(1, 2, 3, 4, 5))
    //使用    : _*   告诉编译器这个参数被当作参数序列来处理
    println("变长参数 ： " + addSum(1 to 10: _*))


  }

  /**
   * 定义函数的语法：def 函数名(参数列表)：返回值类型={函数体}
   * 函数体最后一条语句的返回值作为整个函数的返回值，返回值不需要使用return关键值
   * 也可以不声明返回值类型，Scala会自动根据最后一条语句返回值类型推断出函数的返回值类型
   * 但是，如果函数是递归函数，其返回值类型必须声明
   *
   * @param num1 第一个参数
   * @param num2 第二个参数
   * @return
   */
  def add(num1: Int, num2: Int) = {
    num1 + num2
  }

  /**
   * 使用递归计算阶乘
   *
   * @param num
   * @return
   */
  def factorial(num: Int): Long = {
    if (num <= 1) 1
    else num * factorial(num - 1)

  }

  /**
   * 通过递归实现斐波那契数列：1，1，2，3，5，8，13……
   *
   * @param num
   * @return
   */
  def fibonacci(num: Int): Long = {
    if (num == 1 || num == 2) 1
    else fibonacci(num - 1) + fibonacci(num - 2)
  }

  /**
   * 如果函数没有返回值，返回值类型为Unit，类似于Java的void，类型以及等号可以省略
   * 在Scala中，没有返回值的函数称为过程
   *
   * @param x
   * @param y
   */
  def getSum(x: Int, y: Int) {
    println(x + y)
  }

  /**
   * 函数中的参数可以有默认值，称为默认函数
   *
   * @param x
   * @param y
   * @return
   */
  def add2(x: Int = 10, y: Int = 20): Int = {
    x + y
  }

  /**
   * 变长参数：参数类型右边加上*号
   * 变长参数一个方法只能出现一个，且在最后，类似Java可变参数
   * 在Spark源码中，有大量的变长参数
   *
   * @param nums
   * @return
   */
  def addSum(nums: Int*): Int = {
    nums.sum
  }

}
