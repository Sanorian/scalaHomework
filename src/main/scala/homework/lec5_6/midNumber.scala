package homework.lec5_6

object midNumber {
  def main(args: Array[String]): Unit = {
    println(getMid(List(Option(1), Option(2), Option(3), None)))
  }
  def getMid(list: List[Option[Int]]): Double = {
    var sum = 0
    var countOfNumbers = 0;
    for (opt <- list){
      if (opt.isDefined){
        sum+=opt.get
        countOfNumbers+=1
      }
    }
    if (countOfNumbers!=0) sum/countOfNumbers
    else 0
  }
}
