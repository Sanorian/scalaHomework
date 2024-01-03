package homework.lec5_6

object MapOptionX2 {
  def main(args: Array[String]): Unit = {
    println(mapping(Map("a" -> Option(2))))
  }
  def mapping(mapa: Map[String, Option[Int]]): Map[String, Option[Int]]={
    val keys = mapa.keys
    val values = mapa.values
    Map(keys.head -> values.head.map(_*2))
  }
}
