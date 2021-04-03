package Lectures.part1basics

object Functions extends App {


  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("Markus", 33))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  def aFunctionWithSideEffects(aString: String): Unit =
    println(aString)

  aFunctionWithSideEffects("Hello")

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }

  println(aBigFunction(10))

  def factorial(n: Int): Int =
    if(n <= 0) 1
    else n * factorial(n-1)

  println(factorial(19990))

}
