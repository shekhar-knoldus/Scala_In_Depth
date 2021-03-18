package org.knoldus


object CustomClass {
  def main(args: Array[String]): Unit = {
   val customQueue= new CustomQueue[String]

    val str1=customQueue.enqueue(List(), "Shekhar")
    println(str1)
    val str2=customQueue.enqueue(List(), "Suraj")
    println(str2)

    println(customQueue.isEmpty(str1))
   customQueue.dequeue(str2)
    println(customQueue.isEmpty(str2))
  }
  
}
