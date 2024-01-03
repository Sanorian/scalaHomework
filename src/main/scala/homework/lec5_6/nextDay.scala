package homework.lec5_6

import java.util

object nextDay {
  object dayOfTheWeek extends Enumeration {
    type dayOfTheWeek = Value
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }
  def main(args: Array[String]): Unit = {
    println(getNextDay1(dayOfTheWeek, dayOfTheWeek.Tuesday))
    println(getNextDay2(dayOfTheWeek, dayOfTheWeek.Tuesday))
  }
  def getNextDay1[E<:Enumeration](enumerationObject: E, day: E#Value): enumerationObject.Value = {
    val enumList = enumerationObject.values.toList
    val dayIndex = enumList.indexOf(day)
    enumList.apply(dayIndex+1)
  }

  def getNextDay2[E <: Enumeration](enumerationObject: E, day: E#Value): enumerationObject.Value = {
    val enumList = enumerationObject.values.toList
    var isTheNextDayNext = false
    for (elem <- enumList) {
      if (isTheNextDayNext) return elem
      if (elem == day) isTheNextDayNext = true
    }
    enumList.head
  }
}