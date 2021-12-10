package com.knoldus.oop

import scala.collection.mutable.ListBuffer

class SquareQueue extends Queue {
  override def enqueue(queue: ListBuffer[Int], element: Int): ListBuffer[Int] = queue.appended(element * element)
}
