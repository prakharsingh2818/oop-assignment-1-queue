package com.knoldus.oop

import scala.collection.mutable.ListBuffer

class SquareQueue extends Queue {

  //Enqueue implementation by SquareQueue which inserts element at the end after squaring it
  override def enqueue(queue: ListBuffer[Int], element: Int): ListBuffer[Int] = queue.appended(element * element)
}
