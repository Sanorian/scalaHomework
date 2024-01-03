package homework.lec5_6

object MapEqualsValues {
  def main(args: Array[String]): Unit = {
    println(filterByValues(Map("a"->1, "b"-> 4, "d"->2), Map("a"->3, "b"->1, "c"->2)))
  }
  def filterByValues(map1: Map[String, Int], map2: Map[String, Int]): Map[String, Int] = {
    val keys = map1.keys.toList ::: map2.keys.toList
    val values = map1.values.toList ::: map2.values.toList
    var newMap = Map[String, Int]()
    for (i <- 0 until keys.length) {
      for (j <- i + 1 until keys.length) {
        if (values(i) == values(j)) {
          newMap += (keys(i) -> (values(i)))
          newMap += (keys(j) -> (values(i)))
        }
      }
    }
    newMap
  }
}
