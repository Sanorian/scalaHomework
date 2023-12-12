import scala.math._

object Main{
    def main(args: Array[String]): Unit = {
        println(space(1))
        println(space(2))
        println(space(3))
    }
    def space(radius: Int): Double = {
      Pi* radius* radius
    }
}
