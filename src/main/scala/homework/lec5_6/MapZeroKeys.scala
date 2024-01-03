package homework.lec5_6

object MapZeroKeys {
  def main(args: Array[String]): Unit = {
    println(filteringZByZero(Map("a"-> 1, "b"-> -1, "c"->0)))
  }
  def filteringZByZero(mapa: Map[String, Int]): List[Map[String, Int]]={
    var map1  = Map[String, Int]()
    var map2 =Map[String, Int]()
    val keys  = mapa.keys.toList
    val values = mapa.values.toList
    for (i<-0 until keys.length) {
      if (values(i)>0) map1 += (keys(i) -> values(i))
      if (values(i) < 0) map2 += (keys(i) -> values(i))
    }
    List(map1, map2)
  }
}
