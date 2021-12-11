# oop-assignment-1-queue

### The project is a modifies implementation of Queue data structure using scala language. It contains 3 scala classes and one scala object and ons scala trait

1. **Queue**
  - This trait has 2 methods - enqueue and dequeue. 
  - It contains concrete implementation of dequeue which will dequeue elements from the Queue
  
2. **DoubleQueue**
  - This calss extends Queue trait and defines enqueue method such that it adds double of the element to be inserted in the queue.
  
3. **SquareQueue**
  - This class extends Queue trait and defines enqueue method such that it adds square of the element to be inserted in the queue.
  
4. **QueueTester**
  - This scala object is used to check functionalities of DoubleQueue and SquareQueue

5. **QueueTest**
  - This is a test class which makes use of AnyFlatSpec style of ScalaTest 
  
  ### The project uses ListBuffer class of Scala library to implement Queue functionality
  
