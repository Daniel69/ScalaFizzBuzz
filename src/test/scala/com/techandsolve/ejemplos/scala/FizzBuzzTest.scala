package com.techandsolve.ejemplos.scala

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FizzBuzzTest extends FunSuite {
  
  test("3 es Fizz"){
    assert(FizzBuzz.doFizzBuzz(3) === "Fizz")
  }

}

