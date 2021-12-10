package com.knoldus.oop

import scala.collection.mutable.ListBuffer

class DoubleQueue extends  Queue {
  override def enqueue(queue: ListBuffer[Int], element: Int): ListBuffer[Int] = queue.appended(element * 2)
}