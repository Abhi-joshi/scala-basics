package com.abhishek.ScalaApp

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }
  "The Point object" should "move to 15, 29" in {
    val pt = new Point(10, 20)
    pt.move(5, 9)
    pt.x shouldEqual (15)
    pt.y shouldEqual (29)
  }
  "The Multiplier closure" should "return 24" in {
    val demo = new Demo()
    val mulValue: Int = demo.multiplier(8)
    mulValue shouldEqual (24)
  }
  "Sum of array" should "return 6" in {
    val demo = new Demo()
    val total = demo.sumArray()
    total shouldEqual (6)
  }
  "Sum of tuple" should "return 8" in {
    val demo = new Demo()
    val total = demo.sumOfTuple()
    total shouldEqual (8)
  }
  "Equality of Point x and Point y" should "return true" in {
    val pt = new Point(10, 20)
    pt.move(19, 9)
    val isEqual: Boolean = pt.isEqual(pt)
    isEqual shouldEqual (true)
  }
  "Pattern match for 3" should "return three" in {
    val demo = new Demo()
    val result = demo.matchTest(3)
    result shouldEqual ("three")
  }
  "Pattern match for Alice" should "return Hi Alice!" in {
    val demo = new Demo()
    val alice = new Person("Alice", 25)
    val result = demo.matchPerson(alice)
    result shouldEqual ("Hi Alice!")
  }
  "Regular expression for >>>Scala is scalable and cool<<<" should "return Scala,scala" in {
    val demo = new Demo()
    val result = demo.testRegex("Scala is scalable and cool")
    result shouldEqual ("Scala,scala")
  }
}
