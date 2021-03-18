package org.knoldus

class CustomQueue[A]{

  def enqueue (queue : List[A] , element : A) : List[A] = {
    val value =  queue ::: List(element)
    value
  }
  def dequeue(queue:List[A]):List[A]={
    val value = queue.tail
    value
  }
  def isEmpty(queue: List[A]): Boolean={
    if(queue.isEmpty) {
        true
      }
    else {
      false
    }
  }
}
