package homework.lec1_2

object PlusMinusZero{
      def main(args: Array[String]): Unit = {
        println(whatNumber(2))
        println(whatNumber(0))
        println(whatNumber(-1))
      }
      def whatNumber(number: Int): String = {
        if (number>0){
          "positive"
        } else if (number<0){
          "negative"
        }else {
          "zero"
        }
      }
}
