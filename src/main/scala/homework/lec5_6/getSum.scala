package homework.lec5_6

object getSum {
  def main(args: Array[String]): Unit = {
    println(getSummary(List(Option(1), Option(2), Option(3))))
    println(getSummary(List(Option(1), Option(2), Option(3), None)))
  }

  def getSummary(list: List[Option[Int]]): Option[Any] = {
    var sum = 0
    var isNone = false
    for (opt <- list) {
      if (opt.isDefined) sum += opt.get
      else isNone = true
    }
    if (isNone) None
    else Option(sum)
  }
}
