import scala.math._
object Main{
      def main(args: Array[String]): Unit = {
        println(rastoyanie(1, 2, 2, 1))
        println(rastoyanie(1, 1, -1, -1))
      }
      def rastoyanie(x:Double, y: Double, x1:Double, y1: Double): Double = {
        sqrt(abs((x-x1)*(x-x1))+abs((y-y1)*(y-y1)))
      }
}
