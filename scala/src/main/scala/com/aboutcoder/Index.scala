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
}

object Index {
  def main(args: Array[String]): Unit = {
    ClassIndex.action()

  }
}