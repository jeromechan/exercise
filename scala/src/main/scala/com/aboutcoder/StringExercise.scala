package com.aboutcoder

/**
  * <Description>
  * Copyright © 2006-2017 Tuniu Inc. All rights reserved.<br />
  *
  * @author chenjinlong<br />
  * @CreateDate 28/04/2017 2:07 PM<br />
  * @description <br />
  */
object StringExercise {
  def main(args: Array[String]): Unit = {
    println(echoString("a"))
    printStrAsFormat()

    var arr = Array(1, 2, 3)
    var arr2 = Array.apply(11, 33, 44)
    var a  = 1

    val t = new Tuple2("www.google.com", "www.runoob.com")
    println("交换后的元组: " + t.swap )
  }

  def echoString(a : String) : String = {
    var sbf = new StringBuilder
    sbf += 'a'
    sbf ++= "bc"
    sbf.toString
  }

  def printStrAsFormat() : Unit = {
    printf("abc %f %s", 1.09, "str")
  }
}
