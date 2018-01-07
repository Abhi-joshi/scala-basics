package com.abhishek.ScalaApp

import org.scalatest._

class CollectionExampleSpec extends FlatSpec with Matchers {
  val collectionExample = new CollectionExample()

  "The last element of fruit list" should "return pears" in {
    val lastElement: String = collectionExample.lastElementInList()
    lastElement shouldEqual ("pears")
  }
  "The number of elements in name set" should "return 3" in {
    val numberOfElement: Int = collectionExample.numberOfElementInSet()
    numberOfElement shouldEqual (3)
  }
  "Check the key existence in colors map" should "return true" in {
    val isKeyExists: Boolean = collectionExample.checkIfKeyIsPresentInMap("red")
    isKeyExists shouldEqual (true)
  }
}