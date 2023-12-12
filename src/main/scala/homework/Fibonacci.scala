package homework

import scala.collection.mutable.ListBuffer

object Fibonacci{
  def main(args: Array[String]): Unit = {
    var list: ListBuffer[Int] = new ListBuffer[Int]()
    list += 0
    list +=1
    println(fibonacci(10, list))
  }
  
  def fibonacci(i: Int, list: ListBuffer[Int]) : ListBuffer[Int] = {
    if (i==2){
      list
    } else{
      list += list(list.size - 1) + list(list.size - 2)
      fibonacci(i-1, list)
    }
  }
}