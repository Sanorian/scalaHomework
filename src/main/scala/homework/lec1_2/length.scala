package homework.lec1_2

object length{
      def main(args: Array[String]): Unit = {
        println(length("Hello"))
        println(length("Word"))
      }
      def length(str: String): Int = {
        str.length()
      }
}
