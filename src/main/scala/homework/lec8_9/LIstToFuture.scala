package homework.lec8_9
// Напишите функцию, которая принимает список Future[String] и возвращает Future[List[String]], содержащий все значений из исходного списка, преобразованные в верхний регистр
object LIstToFuture {

  import java.util.concurrent.Executors
  import scala.concurrent._
  import scala.concurrent.duration._

  def main(args: Array[String]): Unit = {
    val pool = Executors.newFixedThreadPool(4)
    implicit val executionContext: ExecutionContextExecutor = ExecutionContext.fromExecutor(pool)
    println(Await.result(uppercaseList(List(
      Future {"word"},
      Future {"hello"},
      Future {"new"},
      Future {"scala"}
    )), 10.seconds))
    pool.shutdown()
  }
  def uppercaseList(list: List[Future[String]])(implicit ec: ExecutionContext): Future[List[String]] = {
    Future.sequence(list).map(_.map(_.toUpperCase()))
  }
}
