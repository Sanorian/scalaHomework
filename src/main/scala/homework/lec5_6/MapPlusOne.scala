package homework.lec5_6

object MapPlusOne {
  def main(args: Array[String]): Unit = {
    println(incrementing(Map("a"-> 4, "b"-> -1)))
  }
  def incrementing(mapa: Map[String, Int]): Map[String, Int] = {
    var newMap = Map[String, Int]()
    val keys= mapa.keys.toList
    val values = mapa.values.toList
    for (i<-0 until keys.length) newMap += (keys(i)-> (values(i)+1))
    newMap
  }
}
