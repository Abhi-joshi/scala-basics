package com.abhishek.ScalaApp

import scala.util.matching.Regex

class Point(val xc: Int, val yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
  
  def isEqual(obj: Any) = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == y
  
}

case class Person(name: String, age: Int)

class Demo {
  var myArray = Array(1, 2, 3)
  var total = 0
  var factor: Int = 3
  var tuple = Tuple3(1,3,4)
  
  val multiplier = (i: Int) => i * factor

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
  
  def sumOfTuple(): Int = {
    tuple._1 + tuple._2 + tuple._3
  }
  
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "other"
  }
  
  def matchPerson(person: Person): String = person match {
    case Person("Alice", 25) => "Hi Alice!"
    case Person("Bob", 32) => "Hi Bob!"
    case Person(name, age) => "Hi "+ name 
  }
  
  def testRegex(str: String): String = {
    val pattern = new Regex("(S|s)cala")
    (pattern findAllIn str).mkString(",")
  }

}

object Hello {
  val greeting: String = "hello"
  def main(args: Array[String]): Unit = {
    println(greeting)

    val pt = new Point(10, 20)
    // Move to a new location
    pt.move(5, 9)
    
    //trait example
    println("Is Point fields equals " + pt.isEqual(pt))

    val demo = new Demo();
    demo.printArray();
    println("Sum of array is " + demo.sumArray())
    println("Result of multiplication is " +  demo.multiplier(8))
    println("Sum of tuple is " +  demo.sumOfTuple())
        
    //Pattern matching example
    println("Patten match " + demo.matchTest(3))
    
    //Pattern match with case class
    val aclice  = new Person("Alice", 25)
    val bob = new Person("Bob", 27)
    val charlie = new Person("Charlie", 30)
    
    for(person <- List(aclice, bob, charlie)){
      println("Pattern match for "+ person.name + " " + demo.matchPerson(person))
    }
    
    //Regular expression
    println("Regular expression "+demo.testRegex("Scala is scalable and cool"));
    
    //Collection examples
    val collectionExample = new CollectionExample();
    collectionExample.listOperations();
    collectionExample.setOperations();
    collectionExample.mapOperations();

  }
}
