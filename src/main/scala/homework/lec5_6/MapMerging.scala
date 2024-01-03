package homework.lec5_6

object MapMerging {
  def main(args: Array[String]):Unit = {
    println(merge(Map("a"->1, "b"->2, "c"->3), Map("c"->3, "d"->4, "e"->5)))
  }
  def merge(map1: Map[String, Int], map2: Map[String, Int]): Map[String, Int] = {
    var keys = map1.keys.toList ::: map2.keys.toList
    var values = map1.values.toList ::: map2.values.toList
    var newMap = Map[String, Int]()
    var alreadyUsed = List[String]()
    for(i<-0 until keys.length){
      var isUnique = true
      for(j<- i+1 until keys.length){
        if (keys(i) == keys(j)) {
          isUnique = false
          newMap += (keys(i) -> (values(i)+ values(j)))
          alreadyUsed = alreadyUsed :+ keys(j)
        }
      }
      if (isUnique && !isIn(alreadyUsed, keys(i))) newMap += (keys(i)->values(i))
    }
    newMap
  }
  def isIn(list: List[String], el: String): Boolean = {
    var thereAre = false
    for (key<-list){
      if (key==el){
        thereAre = true
      }
    }
    thereAre
  }
}
