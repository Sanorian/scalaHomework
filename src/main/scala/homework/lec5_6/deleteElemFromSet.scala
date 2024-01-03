package homework.lec5_6

object deleteElemFromSet {
  def main(args: Array[String]): Unit = {
    println(remove(Set(1, 2, 3), 1))
  }
  def remove(set: Set[Int], num: Int): Set[Int] = {
    set - num
  }
}
