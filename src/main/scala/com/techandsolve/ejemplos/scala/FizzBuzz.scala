package com.techandsolve.ejemplos.scala

object FizzBuzz {
  def doFizzBuzz(x: Int) : String = x  match {
    case n if n%3 == 0 && n%5 == 0 => "FizzBuzz"
    case n if n % 3 == 0 => "Fizz"
    case n if n % 5 == 0 => "Buzz" 
    case other => s"$other" 
  }
}