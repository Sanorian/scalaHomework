package homework

object EvenOrOdd{
      def main(args: Array[String]): Unit = {
        println(isEven(2))
        println(isEven(1))
        println(isEven(4))
      }
      def isEven(number: Int): String = {
        if (number%2==0) {
          "Even"
        } else {
          "Odd"
        }
      }
}
