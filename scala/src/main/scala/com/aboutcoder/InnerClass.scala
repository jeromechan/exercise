package com.aboutcoder

/**
  * <Description>
  * Copyright © 2006-2017 Tuniu Inc. All rights reserved.<br />
  *
  * @author chenjinlong<br />
  * @CreateDate 26/04/2017 4:15 PM<br />
  * @description <br />
  */
class InnerClass {

}

object InnerObject {
  def main(args: Array[String]): Unit = {
    InnerObject.func1()

    var add3 = (x : Int) => x + 1
    println(InnerObject.add2(1))
    println(add3(5))
  }

  def func1() : Unit = {
    def func2() : Unit = {
      println("inner func2")
    }
    func2();
    println("func1")
  }

  def add2 = new Function1[Int, Int] {
    def apply(x: Int): Int = x + 1
  }
}
