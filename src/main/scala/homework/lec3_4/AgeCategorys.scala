package homework.lec3_4

object AgeCategorys {
  def main(args: Array[String]): Unit = {
    println(getCategory(Option(20)))
  }
  def getCategory(age: Option[Int]): String = {
    val intAge = age.getOrElse(-1)
    if (intAge == -1) "Option пуст"
    else if (intAge < 11) "Ребенок"
    else if (intAge < 19) "Подросток"
    else if (intAge < 50) "Взрослый"
    else if (intAge < 65) "Пожилой"
    else "Старик"
  }
}