package homework.lec3_4

trait Shape{
  def getSpace : Double
}

case class Circle(radius: Double) extends Shape{
  override def getSpace(): Double = {
    math.Pi * radius* radius
  }
}

case class Square(sideLength: Double) extends Shape{
  override def getSpace(): Double = {
    math.pow(sideLength, 2)
  }
}

case class Rectangle(side1Length: Double, side2Length: Double) extends Shape{
  override def getSpace(): Double = {
    side1Length * side2Length
  }
}