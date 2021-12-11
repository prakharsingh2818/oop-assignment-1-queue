package com.knoldus.oop

import scala.collection.mutable.ListBuffer

class DoubleQueue extends  Queue {

  //Enqueue implementation by DoubleQueue which inserts element at the end after doubling it
  override def enqueue(queue: ListBuffer[Int], element: Int): ListBuffer[Int] = queue.appended(element * 2)
}