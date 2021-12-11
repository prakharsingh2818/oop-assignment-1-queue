package com.knoldus.oop

import scala.collection.mutable.ListBuffer
import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}

object QueueTester extends App{
  //Actual Queue to store data
  var queue = new ListBuffer[Int]

  //Variable to giver user choice whether to enqueue, dequeue, print or exit from the program
  var choice : Int = 0

  //To store the element to be added to the queue
  var element : Int = 0

  //To store whether to use SquareQueue or DoubleQueue
  var queueChoice : Queue = _

  println("***WELCOME***")
  breakable {
    while(true) {
      println("1. Insert element after doubling")
      println("2. Insert element after squaring")
      println("3. Delete element from queue")
      println("4. Show current Queue")
      println("5. EXIT")

      print("\n\n\nENTER CHOICE: ")

      choice = StdIn.readInt()

      choice match {
        case 1 => println("\n\nEnter element to be added to the queue: ")
          element = StdIn.readInt()
          queueChoice = new DoubleQueue()
          queue = queueChoice.enqueue(queue, element)
        case 2 => println("\n\nEnter element to be added to the queue: ")
          element = StdIn.readInt()
          queueChoice = new SquareQueue()
          queue = queueChoice.enqueue(queue, element)
        case 3 => if(queue.isEmpty)
          println("QUEUE IS EMPTY")
        else {
          println("\n\nDeleting element from the queue.....")
          queue = queueChoice.dequeue(queue)
        }
        case 4 => if(queue.isEmpty)
          println("QUEUE IS EMPTY")
        else {
          for(element <- queue) {
            print(element+"   ")
          }
          println()
        }
        case 5 => println("\n\n***EXITING***")
          break
        case _ => println("Invalid Choice")

      }
    }
  }
}
