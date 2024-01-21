package homework.lec8_9
// Напишите функцию, которая принимает спико Future[Int] и возвращает Future[Int], представляющих сумму всех значений в этиъ Future
object FutureSum {
  import java.util.concurrent.Executors
  import scala.concurrent._
  import scala.concurrent.duration._
  def main(args: Array[String]): Unit = {
    val pool = Executors.newFixedThreadPool(4)
    implicit val executionContext: ExecutionContextExecutor = ExecutionContext.fromExecutor(pool)
    println(Await.result(summing(List(
      Future{1},
      Future{2},
      Future{3},
      Future{4}
    )), 10.seconds))
    pool.shutdown()
  }
  def summing(list: List[Future[Int]])(implicit ec: ExecutionContext): Future[Int]={
    Future.sequence(list).map(_.sum)
  }
}
