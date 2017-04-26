package com.aboutcoder

/**
  * <Description>
  * Copyright © 2006-2017 Tuniu Inc. All rights reserved.<br />
  *
  * @author chenjinlong<br />
  * @CreateDate 26/04/2017 7:52 PM<br />
  * @description <br />
  */
class CurryingFunction {

}

object Currying {
  def main(args: Array[String]): Unit = {
    val result = action(1)(4)
    println(result)
  }

  /**
    * Function contains currying process
    *
    * @param x
    * @param y
    * @return
    */
  def action(x: Int)(y: Int) : Int = {
    x + y
  }

}
