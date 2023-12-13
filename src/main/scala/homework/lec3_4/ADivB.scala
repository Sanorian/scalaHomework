package homework.lec3_4

import scala.util.Try
import scala.util.Failure
import scala.util.Success
object ADivB {
  def main(args: Array[String]): Unit = {

    divOption(1, 2) match {
      case Some(value) => println(value)
      case None => println("Ошибочка")
    }

    divTry(1, 2) match{
      case Success(value)=>println(value)
      case Failure(err)=>println(err)
    }

    divEither(1, 2) match {
      case Left(err) => println(err)
      case Right(value) => println(value)
    }
  }
  def divOption(a: Double, b: Double): Option[Double] = {
    Option(a/b)
  }

  def divTry(a: Double, b: Double): Try[Double]  = {
    Try(a/b)
  }

  def divEither(a:Double, b:Double): Either[String, Double] = {
    if (b!=0) Right(a/b)
    else Left("b - ноль")
  }

}
