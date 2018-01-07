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
    val total = demo.sumArray();
    total shouldEqual (6)
  }
}
