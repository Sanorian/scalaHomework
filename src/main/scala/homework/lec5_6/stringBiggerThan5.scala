package homework.lec5_6

object stringBiggerThan5 {
  def main(args: Array[String]): Unit = {
    println(isBiggerThan5(List(Option("Hello World"), Option("Shit"), Option("Michael"))))
  }
  def isBiggerThan5(list: List[Option[String]]): List[Option[String]] = {
    for (opt <- list if (opt.isDefined && opt.getOrElse("").length > 5)) yield opt
  }
}
