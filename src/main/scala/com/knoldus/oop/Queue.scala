package com.knoldus.oop

import scala.collection.mutable.ListBuffer

trait Queue {

  //Abstract enqueue method with definition provided by the implementing classes
  def enqueue(queue: ListBuffer[Int], element: Int): ListBuffer[Int]

  //Dequeue method which removes the first element from the queue
  def dequeue(queue: ListBuffer[Int]): ListBuffer[Int] = {
    queue.remove(0)
    queue
  }
}