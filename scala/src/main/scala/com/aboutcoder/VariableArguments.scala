package com.aboutcoder

/**
  * <Description>
  * Copyright © 2006-2017. All rights reserved.<br />
  *
  * @author chenjinlong<br />
  */
object VariableArguments {
  def main(args: Array[String]) {
    printStrings(a = 999, "Runoob", "Scala", "Python");
  }

  def printStrings(a: Int, args: String*): Unit = {
    var i: Int = 0;
    for (arg <- args) {
      print("a" + a)
    }
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }
}
