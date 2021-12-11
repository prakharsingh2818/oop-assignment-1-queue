# oop-assignment-1-queue

### The project is a modified implementation of Queue data structure using scala language. It contains 3 scala classes and one scala object and one scala trait

1. **Queue**
  - This trait has 2 methods - enqueue and dequeue. 
  - It contains concrete implementation of dequeue which will dequeue elements from the Queue
  
2. **DoubleQueue**
  - This calss extends Queue trait and defines enqueue method such that it adds double of the element to be inserted in the queue.
  
3. **SquareQueue**
  - This class extends Queue trait and defines enqueue method such that it adds square of the element to be inserted in the queue.
  
4. **QueueTester**
  - This scala object is used to check functionalities of DoubleQueue and SquareQueue. This will ask the user whether they want to enqueue, dequeue, or print the queue and will also provide them a choice to exit the program at any moment 

5. **QueueTest**
  - This is a test class which makes use of AnyFlatSpec style of ScalaTest 
  
  ###  Queue is a FIFO based data structure in which insertions are from the end and deletions take place from the beginning
  
  ### The project uses ListBuffer class of Scala library to implement Queue functionality. I have used ListBuffer as it is a mutable Collection in Scala and queue requires frequet changes to be made in the collections.
  
  ### To implement it I have used appended() method of ListBuffer class to add element at the end and remove() method to remove elements from the head
  
  ### We need to run QueueTester object to execute the program.
  
