package homework.lec7

object lec7 {
  def main(args: Array[String]): Unit = {
    println(iterating(List(func1, func2, func3), 1))
    println(returnFunc(List(func1, func2, func3))(1))

    println(tripleFunction("alpha", 1, 2.0))
    println(part(List(1, 2, 3, 4, 5, 6, 7, 8, 9)))
    println(10.multiplyX10())
    println(10.isEven())
    println(USDtoRUB(10))
  }
  // Напишите функцию, которая принимает список функций и значение, а затем возвращает список результатов применения каждой функции к этому значению.
  def iterating(list: List[Int => Int], number: Int): List[Int] = {
    var resultList = List[Int]()
    list.foreach((func) => {
      resultList = resultList :+ func(number)
    })
    resultList
  }
  def func1(x: Int): Int = {x*1}
  def func2(x: Int): Int = {x*2}
  def func3(x: Int): Int = {x*3}
  // Напишите функцию высшего порядка, которая принимает список функций и возвращает новую функцию, которая применяет каждую функцию из списка к результату предыдущей функции. Например, если дан список функций List((x: Int) => x + 1, (x: Int) => x * 2), то результирующая функция должна выполнять следующее: f(x) = (x + 1) * 2
  def returnFunc(list: List[Int=>Int]): Int=>Int = {
    val f = (number: Int) => {
      var result = number
      list.foreach ((func) => result = func (result))
      result
    }
    f
  }
  // Напишите функцию, которая принимает другую функцию двух аргументов и возвращает каррированную версию этой функции (т.е. функцию, которая принимает первый аргумент и возвращает функцию, принимающую второй аргумент)

  //Напишите функцию, которая принимает три аргумента (String, Int, Double) и объединяет их в одну строку через пробел. Затем преобразуйте эту функцию в каррированную версию, которая принимает первый аргумент и возвращает функцию, принимающую оставшиеся два аргумента
  def tripleFunction(str: String, int: Int, double: Double): String = {
    val f = (str: String)=> {
      var result = s"$str"
      (int: Int, double: Double) => {
        result+=s" $int $double"
      }
        result
    }
    f(str)(int, double)
  }

  // Напишите частичную функцию, которая принимает список целых чисел и возвращает новый список, содержащий только те числа, которые являются квадратами других чисел
  val part: PartialFunction[List[Int], List[Int]] = {
    case list => {
      var newList = List[Int]()
      for (i<- 0 until list.length){
        for (j<-0 until list.length){
          if (list(i)==list(j)*list(j)) newList = newList :+ list(i)
        }
      }
      newList
    }
  }
  // Создайте implicit class для Int, который добавляет метод для умножения числа на определенное значение. Например, метод для умножения числа на 10
  implicit class MyClass1 (val i: Int) {
    def multiplyX10(): Int = i*10
  }
  // Создайте implicit class для Int, который добавляет метод для проверки, является ли число четным
  implicit class MyClass2(val i: Int) {
    def isEven(): Boolean = if (i%2==0) true else false

  }

  //Напишите implicit val для хранения значения курса обмена валюты (например, USD to RUB) и используйте его для функции конвертации суммы денег из одной валюты в другую
  implicit val USD : Double = 87.96
  def USDtoRUB(count: Double)(implicit USD: Double): Double={
    count*USD
  }

  // Создайте case class Person с полями name:String и age:Int. Затем определите implicit val для объекта типа Ordering[Person], который сравнивает объекты Person по возрасту. Создайте List[Person], заполненный какими-либо экземплярами класса Person, напечатайте его на консоль, отсортируйте список и напечатайте отсортированный список на консоль
  case class Person(name: String, age: Int)
  implicit val
}
