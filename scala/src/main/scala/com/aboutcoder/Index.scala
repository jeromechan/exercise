package com.aboutcoder

/**
  * <Description>
  * Copyright © 2006-2017 All rights reserved.<br />
  *
  * @author chenjinlong<br />
  */

class ClassIndex {
  def action(): Unit = {
    println("From Index class.")
  }
}

object ClassIndex {
  def action(): Unit = {
    println("From Index object.")
  }

  def returnString(): String = {
    "string here"
  }

  def returnInt(): Int = {
    return 1
  }
}

object Index {
  def main(args: Array[String]): Unit = {
    ClassIndex.action()
    // 声明常量
    val a = 'x
    val b = Symbol("abc")
    println(a)
    println(b)

    // 声明变量
    var c : String = "def";

    // 声明元组
    val pa1 = (41, "abc", 'a, 'c');
    val pa2 : (Int, String) = (41, "abc");
  }
}
