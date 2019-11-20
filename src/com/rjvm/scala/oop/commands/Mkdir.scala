package com.rjvm.scala.oop.commands
import com.rjvm.scala.oop.filesystem.State

class Mkdir(name: String) extends Command {
  override def apply(state: State): State = {
    val wd = state.wd
    if(wd.hasEntry(name)){
      state.setMessage("Entry "+name+" already exists!")
    }
  }
}
