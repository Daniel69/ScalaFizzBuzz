package com.techandsolve.ejemplos.scala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import scala.util.Random

@RunWith(classOf[JUnitRunner])
class FizzBuzzTest extends FunSuite {
  
  val multiplosDe3 = (1 to 100) filter {x => x%3 == 0 && x%5 != 0}
  val multiplosDe5 = (1 to 100) filter {x => x%5 == 0 && x%3 != 0}
  val noMultiplos =  (1 to 100) filter {x => x%5 != 0 && x%3 != 0}
  
  test("3 es Fizz"){
    assert(FizzBuzz.doFizzBuzz(3) === "Fizz")
  }
  
  test("5 es Buzz"){
    assert(FizzBuzz.doFizzBuzz(5) === "Buzz")
  }  
  
  test("un multiplo de 3 y 5 es FizzBuzz"){
    assert(FizzBuzz.doFizzBuzz(3*5*Random.nextInt(90)) === "FizzBuzz")
  }
  
  test("Multiplos de 3 y no de 5 son Fizz"){
    multiplosDe3 foreach { x =>
       assert(FizzBuzz.doFizzBuzz(x) === "Fizz") 
    }
  }
  
  test("Multiplos de 5 y no de 3 son Buzz"){
    multiplosDe5 foreach { x =>
       assert(FizzBuzz.doFizzBuzz(x) === "Buzz") 
    }
  }  
  
  test("Los que no sean multiplos de 5 ni de 3 son el numero"){
    noMultiplos foreach { x =>
       assert(FizzBuzz.doFizzBuzz(x) === s"$x") 
    }
  }  

}

