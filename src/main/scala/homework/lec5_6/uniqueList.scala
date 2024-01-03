package homework.lec5_6

object uniqueList {
    def main(args: Array[String]): Unit = {
      println(uniquefied(List(1, 2, 3, 1)))
    }
    def uniquefied(notUniqueList: List[Any]): List[Any] = {
      var newList = List[Any]()
      for (i <- 0 until notUniqueList.length) {
        var isUnique = true
        for (j <- i + 1 until notUniqueList.length) {
          if (notUniqueList(i) == notUniqueList(j)) isUnique = false
        }
        if (isUnique) newList = newList :+ notUniqueList(i)
      }
      newList
    }
}