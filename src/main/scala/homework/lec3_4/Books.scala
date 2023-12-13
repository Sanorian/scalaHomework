package homework.lec3_4

class Book(name: String, author: String, yearOfPublication: Int)
object Book {
    def main(args: Array[String]) = {
      val book: Book = addBook("Scala для нетерпеливых", "Кей Р. Хорстманн", 2012)
    }

    def addBook(name: String, author: String, yearOfPublication: Int): Book = {
      new Book(name, author, yearOfPublication)
    }
}