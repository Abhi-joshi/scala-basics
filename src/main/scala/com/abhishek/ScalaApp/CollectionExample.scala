package com.abhishek.ScalaApp

class CollectionExample {

  //List of String
  val fruit: List[String] = List("apples", "oranges", "pears")

  // List of Integers
  val nums: List[Integer] = List(1, 2, 3)

  //Empty List
  val empty: List[Nothing] = List()
  
  //Set of String
  val name: Set[String] = Set("John", "Kelly", "Chris")

  // Set of Integers
  val rank: Set[Integer] = Set(1, 2, 3)

  //Empty Set
  val emptySet: Set[Nothing] = Set()
  
  // A map with keys and values.
  val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
  
  // Empty hash table whose keys are strings and values are integers
  val emptyMap: Map[Char, Int] = Map()
  
  /**
   * Operation which can be perform on List
   */
  def listOperations(){
      println( "Head of fruit : " + fruit.head )
      println( "Tail of fruit : " + fruit.tail )
      println( "Check if fruit is empty : " + fruit.isEmpty )
      println( "Check if nums is empty : " + nums.isEmpty )
  }
  
  /**
   * Get the last element of list
   */
  def lastElementInList(): String = {
      fruit.last
  }
  
  /**
   *  Operation which can be perform on Set
   */
  def setOperations(){
      println( "Head of name : " + name.head )
      println( "Tail of name : " + name.tail )
      println( "Check if name is empty : " + name.isEmpty )
      println( "Check if rank is empty : " + rank.isEmpty )
  }
  
  /**
   * 
   */
  def numberOfElementInSet(): Int = {
    name.size
  }
  
  /**
   *  Operation which can be perform on Map
   */
  def mapOperations(){
      println( "Keys in colors : " + colors.keys )
      println( "Values in colors : " + colors.values )
      println( "Check if colors is empty : " + colors.isEmpty )
      println( "Check if nums is empty : " + emptyMap.isEmpty )
  }
  
  /**
   * Function to return true if map conatins the given key
   */
  def checkIfKeyIsPresentInMap(color: String): Boolean = {
    colors.contains(color);
  }

}