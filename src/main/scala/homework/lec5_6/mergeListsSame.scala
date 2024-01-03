package homework.lec5_6

object mergeListsSame {
  def main(args: Array[String]): Unit = {
    println(merge(List("Hello", "Hola", "Privet"), List("Hi", "Aloha", "Privet")))
  }
  def merge(list1: List[String], list2: List[String]): List[String] = {
    for(word1 <- list1; word2 <- list2 if word1==word2) yield word1
  }
}
