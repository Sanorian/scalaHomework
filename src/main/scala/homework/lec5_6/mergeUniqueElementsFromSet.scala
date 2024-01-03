package homework.lec5_6

object mergeUniqueElementsFromSet {
  def main(args: Array[String]): Unit = {
    println(mergeUnique(Set(1,2,3,5), Set(1,2,4)))
  }
  def mergeUnique(set1: Set[Int], set2: Set[Int]): Set[Int] = {
    set1.diff(set2).union(set2.diff(set1))
  }
}
