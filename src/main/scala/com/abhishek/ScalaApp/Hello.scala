package com.abhishek.ScalaApp

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("Point x location : " + x);
    println("Point y location : " + y);
  }

  var factor: Int = 3
  val multiplier = (i: Int) => i * factor

}

class Demo {
  var myArray = Array(1, 2, 3)
  var total = 0
  def printArray(): Unit = {
    for (i <- myArray) {
      println("Element " + i)
    }
  }
  
  def sumArray(): Int = {
    for (i <- myArray) {
      total += i
    }
    total
  }
  
}

object Hello {
  val greeting: String = "hello"
  def main(args: Array[String]): Unit = {
    println(greeting)

    val pt = new Point(10, 20)
    // Move to a new location
    pt.move(5, 9)

    val mulValue: Int = pt.multiplier(8);
    println("Result of multiplication is " + mulValue)
    
    val demo = new Demo();
    demo.printArray();
    println("Sum of array is " + demo.sumArray())
  }
}
