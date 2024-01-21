package homework.lec8_9
// Напишите обобщенную функцию, которая принимает список элементов любого типа и возвращает количество элементов в этом списке
object ListLength {
  def main(args:Array[String]): Unit = {
    println(getLength(List(1, 2, 3)))
    println(getLength(List("a", "b", "c")))
  }
  def getLength[A](list: List[A]): Int = {
    list.length
  }
}
