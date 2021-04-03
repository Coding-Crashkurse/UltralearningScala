package Lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  //println(factorial(100000))

  @tailrec
  def tail_factorial(x: Int, accumulator: Int): Int =
    if(x <= 1) accumulator
    else tail_factorial(x - 1, x * accumulator) // TAIL RECURSION

  println(tail_factorial(100000, 1))

}
