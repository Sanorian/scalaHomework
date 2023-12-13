package homework.lec3_4

object StringOrNone {
  def main(args: Array[String]): Unit = {
    val opt : Option[String] = Option("бульба")
    println(isOptionHasWord(opt, "бульба"))
  }
  def isOptionHasWord(opt: Option[String], word: String): String = {
    opt.getOrElse("Option пуст") match{
      case w if w==word => "Слово найдено"
      case _ => "Слово не найдено"
    }
  }
}
