package hhb.cn.part10

object IntToStringImplicit {

  implicit def int2String(num: Int): String = {
    num.toString
  }
}
