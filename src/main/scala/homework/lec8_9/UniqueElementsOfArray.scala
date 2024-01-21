package homework.lec8_9
// Напишите обобщенную функцию, которая принимает список элементов типа T и возвращает новый список, содержащий только уникальные элементы исходного списка
object UniqueElementsOfArray {
  def main(args: Array[String]): Unit = {
    println(getUnique(List(1, 2, 1, 3, 1)))
    println(getUnique(List("a", "b", "c", "a", "a")))
  }
  def getUnique[A](list: List[A]):List[A]={
    var newList = List[A]()
    for (i<-0 until list.length){
      var isRepeated = false
      for (j<-0 until list.length){
        if (i!=j && list(i)==list(j)){
          isRepeated = true
        }
      }
      if (!isRepeated){
        newList = newList :+ list(i)
      }
    }
    newList
  }
}
