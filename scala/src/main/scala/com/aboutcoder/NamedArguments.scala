package com.aboutcoder

/**
  * <Description>
  * Copyright © 2006-2017 . All rights reserved.<br />
  *
  * @author chenjinlong<br />
  */
object NamedArguments {
  def main(args: Array[String]) : Unit = {
    printInt(b = 5, a = 7);
  }

  def printInt(a: Int, b: Int) : Unit = {
    println("Value of a : " + a);
    println("Value of b : " + b);
  }
}
