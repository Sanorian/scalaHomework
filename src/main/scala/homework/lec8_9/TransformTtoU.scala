package homework.lec8_9
// Напишите обобщенную функцию, которая принимает список элементов типа T и функцию преобразования типа T в тип U, и возвращает список элементов типа U, полученных применением этой функции к каждому элементу исходного массива
object TransformTtoU {
  def main(args: Array[String]): Unit = {
    println(transform(List(1, 2, 3), itos))
  }
  def transform[T, U](list: List[T], f: T=>U): List[U] = {
    var newList = List[U]()
    list.foreach((elem)=>{
      newList = newList :+ f(elem)
    })
    newList
  }
  def itos(int: Int): String = {
    ""+int
  }
}
