package homework

object UntilTo{
      def main(args: Array[String]): Unit = {
        untilTen()
        println("---")
        toTen()
      }
      def untilTen(): Unit = {
        for (i <- 1 until 10){
          println(i)
        }
      }
      def toTen(): Unit = {
        for (i <- 1 to 10){
          println(i)
        }
      }
}
