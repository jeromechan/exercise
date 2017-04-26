package com.aboutcoder

import java.util.Date

/**
  * <Description>
  * Copyright © 2006-2017 Tuniu Inc. All rights reserved.<br />
  *
  * @author chenjinlong<br />
  * @CreateDate 26/04/2017 7:40 PM<br />
  * @description <br />
  */
class PartiallyAppliedFunction {

}

object Execute {
  /**
    * main entry function
    *
    * 偏应用函数
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    val date = new Date
    val logDateWithString = log(date, _ : String)
    logDateWithString("hello")
    logDateWithString("hello1")
    logDateWithString("hello2")
  }

  /**
    * Print result string
    * @param date
    * @param string
    */
  def log(date: Date, string: String) : Unit = {
    println(date + "-----" + string)
  }
}
