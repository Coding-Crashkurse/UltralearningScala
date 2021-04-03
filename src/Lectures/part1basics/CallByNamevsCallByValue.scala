package Lectures.part1basics

object CallByNamevsCallByValue extends  App {
  def calledByValue(x: Long): Unit = {
    println("by value " + x)
    println("by value " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by value " + x)
    println("by value " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

}
