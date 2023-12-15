package homework.lec3_4

trait Shape

case class Circle(radius: Double) extends Shape

case class Square(sideLength: Double) extends Shape
case class Rectangle(side1Length: Double, side2Length: Double) extends Shape
case class Triangle(baseLength: Double, heightLength: Double) extends Shape

case class Rhombus(diagonal1Length: Double, diagonal2Length: Double) extends Shape

case class Parallerogramm(baseLength: Double, heightLength: Double) extends Shape
case class Trapezoid(base1Length: Double, base2Length: Double, heightLength: Double) extends Shape


object Space {
  def getSpace(shape: Shape): Double = {
    shape match{
      case Circle(radius)=> radius*radius*math.Pi
      case Square(sideLength) => sideLength*sideLength
      case Rectangle(side1Length, side2Length) => side1Length*side2Length
      case Triangle(baseLength, heightLength) => baseLength*heightLength/2
      case Rhombus(diagonal1Length, diagonal2Length) => diagonal1Length*diagonal2Length/2
      case Parallerogramm(baseLength, heightLength) => baseLength*heightLength
      case  Trapezoid(base1Length, base2Length, heightLength) => (base1Length+base2Length)/2*heightLength
    }
  }
}
