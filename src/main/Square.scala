object Square{
    def main(args: Array[String]): Unit = {
        println(square(1))
        println(square(2))
        println(square(3))
    }

    def square(count: Int): Int = {
      count*count
    }
}
