package homework.lec5_6


import java.util

object enumerationsFromTo {
  object dayOfTheWeek extends Enumeration {
    type dayOfTheWeek = Value
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  def main(args: Array[String]): Unit = {
    println(fromTo(dayOfTheWeek, dayOfTheWeek.Monday, dayOfTheWeek.Wednesday))
  }

  def fromTo[E<: Enumeration](enumerationObject: Enumeration, from: E#Value, to: E#Value): List[enumerationObject.Value] = {
    val enumList = enumerationObject.values.toList
    val fromIndex = enumList.indexOf(from)
    val toIndex = enumList.indexOf(to)
    enumList.filter(x => fromIndex <= enumList.indexOf(x) && enumList.indexOf(x) <= toIndex)
  }

}
