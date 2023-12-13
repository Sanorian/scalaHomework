package homework.lec3_4
// Не понял задачу. Потому... вот это
object Space {
  import scala.io.StdIn.readLine
  def getSpace(figureType: String): Double = {
    figureType match{
      case "квадрат"=>{
        val a: Int = readLine("Введите длину стороны").toInt
        a*a
      }
      case "прямоугольник" => {
        val a: Int = readLine("Введите длину первой стороны").toInt
        val b: Int = readLine("Введите длину второй стороны").toInt
        a * b
      }
      case "треугольник" => {
        val h: Int = readLine("Введите длину высоты треугольника").toInt
        val a: Int = readLine("Введите длину основания треугольника").toInt
        (a * h)/2
      }
      case "ромб" => {
        val d1: Int = readLine("Введите длину высоты треугольника").toInt
        val d2: Int = readLine("Введите длину основания треугольника").toInt
        (d2 * d1)/2
      }
      case "параллерограмм" => {
        val h: Int = readLine("Введите длину высоты параллерограмма").toInt
        val a: Int = readLine("Введите длину основания паралерограмма").toInt
        a * h
      }
      case "трапеция" => {
        val h: Int = readLine("Введите длину высоты трапеции").toInt
        val a: Int = readLine("Введите длину первого основания трапеции").toInt
        val b: Int = readLine("Введите длину первого основания трапеции").toInt
        (a+b)/2 * h
      }
    }
  }
}
