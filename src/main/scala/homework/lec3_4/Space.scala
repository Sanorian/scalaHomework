package homework.lec3_4

trait Shape1

case class Circle1(radius: Double) extends Shape1

case class Square1(sideLength: Double) extends Shape1
case class Rectangle1(side1Length: Double, side2Length: Double) extends Shape1
case class Triangle1(baseLength: Double, heightLength: Double) extends Shape1

case class Rhombus(diagonal1Length: Double, diagonal2Length: Double) extends Shape1

case class Parallerogramm(baseLength: Double, heightLength: Double) extends Shape1
case class Trapezoid(base1Length: Double, base2Length: Double, heightLength: Double) extends Shape1


object Space {
  def getSpace(shape: Shape1): Double = {
    shape match{
      case Circle1(radius)=> radius*radius*math.Pi
      case Square1(sideLength) => sideLength*sideLength
      case Rectangle1(side1Length, side2Length) => side1Length*side2Length
      case Triangle1(baseLength, heightLength) => baseLength*heightLength/2
      case Rhombus(diagonal1Length, diagonal2Length) => diagonal1Length*diagonal2Length/2
      case Parallerogramm(baseLength, heightLength) => baseLength*heightLength
      case  Trapezoid(base1Length, base2Length, heightLength) => (base1Length+base2Length)/2*heightLength
    }
  }
}
