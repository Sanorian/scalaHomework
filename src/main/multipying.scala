object Main{
      def main(args: Array[String]): Unit = {
        multiplying()
      }
      def multiplying(): Unit = {
        for (i <- 1 to 10){
          println(s"5x$i=${i*5}")
        }
      }
}

