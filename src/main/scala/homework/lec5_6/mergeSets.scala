package homework.lec5_6

object mergeSets {
  def main(args: Array[String]): Unit = {
    println(merge(Set(1, 2, 3), Set(4, 5, 6)))
  }
  def merge(set1: Set[Int], set2: Set[Int]): Set[Int] = {
    set1.union(set2)
  }

}
