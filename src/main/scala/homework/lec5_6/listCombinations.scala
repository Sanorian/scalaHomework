package homework.lec5_6

object listCombinations {
  def main(args: Array[String]):Unit = {
    println(combine(List(1, 2, 3), List(4, 5, 6)))
  }
  def combine(list1: List[Int], list2: List[Int]): List[List[Int]]={
    for (num1 <- list1; num2 <- list2) yield List(num1, num2)
  }
}