package com.aboutcoder

/**
  * <Description>
  * Copyright © 2006-2017 . All rights reserved.<br />
  *
  * @author chenjinlong<br />
  * @CreateDate 04/05/2017 2:19 PM<br />
  * @description <br />
  */
trait BaseMatching {
  var sumDigit : Int

  def func01 : String
  def func02(x : Int) : String = if (x == 1)  "yes" else "no"
}

class BasePatternMatching

class PatternMatching(xIn : Int, yIn : Int) extends BasePatternMatching with BaseMatching {
  override var sumDigit: Int = xIn + yIn

  val x : Int = xIn
  val y : Int = yIn

  override def func01: String = ???

  def matchTest(x : Int) : String = x match {
    case 1 => "hello"
    case 2 => "world"
    case _ => "others"
  }
}

object PatternMatching {
  def main(args: Array[String]): Unit = {
    val cls = new PatternMatching(1, 2)
    println(cls.matchTest(1))
  }
}