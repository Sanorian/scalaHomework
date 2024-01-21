package homework.lec8_9
// Напишите обобщенную функцию, которая принимет список элементов любого типа и возвращает первый элемент списка
object FirstElementOfArray {
  def main(args:Array[String]):Unit={
    println(getFirstElementOfArray(List(1, 2, 3)))
    println(getFirstElementOfArray(List("a", "b", "c")))
    println(getFirstElementOfArray(List(1.0, 2.0, 3.0)))
  }
  def getFirstElementOfArray[A](list: List[A]): A = {
    list(0)
  }
}
