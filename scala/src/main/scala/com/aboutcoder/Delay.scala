package com.aboutcoder

/**
  * <Description>
  * Copyright © 2006-2017 . All rights reserved.<br />
  *
  * @author chenjinlong<br />
  */
// Scala 函数传名调用(call-by-name)
object Delay {
  def main(args: Array[String]) {
    delayed(time());
    immediate(time());
  }

  def time() : Long= {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  def delayed(t: => Long) : Unit = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
    println("-----------")
  }

  def immediate(t: Long) : Unit = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }
}
