package com.knoldus.oop

import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.mutable.ListBuffer

class QueueTest extends AnyFlatSpec {
  behavior of "DoubleQueue"
  val doubleQueue = new DoubleQueue
  var actualQueue : ListBuffer[Int] = ListBuffer[Int]()
  var expectedQueue : ListBuffer[Int] = ListBuffer[Int]()
  var elementToBeInserted : Int = 0

  it should "enqueue double of the element inserted" in {
    elementToBeInserted = 2
    actualQueue = doubleQueue.enqueue(actualQueue, elementToBeInserted)
    expectedQueue = expectedQueue.appended(2*elementToBeInserted)
    assert(expectedQueue.equals(actualQueue))

    elementToBeInserted = -9
    actualQueue = doubleQueue.enqueue(actualQueue, elementToBeInserted)
    expectedQueue = expectedQueue.appended(2*elementToBeInserted)
    assertResult(expectedQueue)(actualQueue)
  }

  it should "dequeue" in {
    actualQueue = doubleQueue.dequeue(actualQueue)
    expectedQueue.remove(0)
    assertResult(expectedQueue)(actualQueue)
  }


  behavior of "SquareQueue"
  val squareQueue = new SquareQueue

  it should "enqueue square of the number inserted" in {
    elementToBeInserted = 6
    actualQueue = squareQueue.enqueue(actualQueue, 6)
    expectedQueue = expectedQueue.appended(elementToBeInserted*elementToBeInserted)
    assertResult(expectedQueue)(actualQueue)

    elementToBeInserted = -9
    actualQueue = squareQueue.enqueue(actualQueue, -9)
    expectedQueue = expectedQueue.appended(elementToBeInserted*elementToBeInserted)
    assertResult(expectedQueue)(actualQueue)
  }
  it should "dequeue" in {
    actualQueue = squareQueue.dequeue(actualQueue)
    expectedQueue.remove(0)
    assertResult(expectedQueue)(actualQueue)
  }
}
