package com.rjvm.scala.oop.commands

import com.rjvm.scala.oop.filesystem.State

trait Command {
  def apply(state: State): State
}

object Command{
  def from(input:String): Command=
    new UnknownCommand
}
