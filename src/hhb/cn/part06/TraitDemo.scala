package hhb.cn.part06


trait HelloTrait {
  def seyHello: String
}

trait MakeFriendTrait {
  def makerFriend
}

class Person(name: String) extends HelloTrait with MakeFriendTrait {
  override def seyHello: String = {
    println(s"Hello,My Name is $name")
    name
  }

  override def makerFriend: Unit = {
    println(s"Hi, $name")
  }
}

//如果一个类继承了多个trait，第一个Trait用extends，其他的Trait用with关键字
object TraitDemo extends App {

  val person = new Person("zhangsan")
  println(person.seyHello)
  person.makerFriend

}
