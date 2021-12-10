package com.knoldus.oop

import scala.collection.mutable.ListBuffer

trait Queue {
  def enqueue(queue: ListBuffer[Int], element: Int): ListBuffer[Int]

  def dequeue(queue: ListBuffer[Int]): ListBuffer[Int] = {
    queue.remove(0)
    queue
  }
}