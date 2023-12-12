package homework

object CToF{
    def main(args: Array[String]): Unit = {
        println(convert(1))
        println(convert(2))
        println(convert(3))
    }
    def convert(temp: Double): Double = {
      (temp*9/5) + 32
    }
}
