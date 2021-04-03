package Lectures.part1basics

object Expressions extends App {

  val x = 1 + "2" // Expression
  println(x)

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // If in Scala ist eine Expression

  var aCondition = if(true) 1 else 2
  println(aCondition)

  var aBlock = {
    2
    3
    var aVariable = 4
    aVariable
  } // Wert von dem Block ist die letzte Expression, haben eigene Scope
  println(aBlock)


}
