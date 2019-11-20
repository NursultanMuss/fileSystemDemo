package com.rjvm.scala.oop.filesystem

import java.util.Scanner

import com.rjvm.scala.oop.commands.Command
import com.rjvm.scala.oop.files.Directory

object Filesystem extends App  {
  val root = Directory.ROOT
  var state = State(root, root)
  val scanner = new Scanner(System.in)
  while (true){
    state .show
    val input = scanner.nextLine()
     state = Command.from(input).apply(state)
  }

}
