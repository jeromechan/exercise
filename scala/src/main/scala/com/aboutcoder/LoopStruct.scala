package com.aboutcoder

/**
  * <Description>
  * Copyright © 2006-2017 . All rights reserved.<br />
  *
  * @author chenjinlong<br />
  * @CreateDate 26/04/2017 3:21 PM<br />
  * @description <br />
  */
object LoopStruct {
  def action(): Unit = {
    var a = 0
    var col = List('a', 'b', 'c')
    // for 循环
    for (a <- 1 to 10) {
      println("Value of a: " + a)
    }

    // for 循环
    for (a <- col
         if a != 'b'; if a != 'a') {
      println("Col of a: " + a)
    }

    // for 循环
    var refVal = for {a <- col
                      if a != 'b'; if a != 'a'
    } yield a
    for (a <- refVal) {
      println("refVal of a: " + a)
    }
  }

  def main(args: Array[String]): Unit = {
    LoopStruct.action()
  }
}
