package homework.lec8_9
// Напишите функцию, которая принимает список строк и возвращает список Future, каждый из которых содержит длину соответствующей строки
object FutureList {
  def main(args: Array[String]): Unit = {
    println(transformToFuture(List("Hello", "World", "one", "1")))
  }
  import scala.concurrent.Future
  def transformToFuture(list: List[String]): List[Future[Int]] = {
    var newList = List[Future[Int]]()
    list.foreach((elem)=>{
      newList = newList :+ Future.successful(elem.length)
    })
    newList
  }
}
