package homework.lec8_9
// нАпишите функцию, которая асинхронно вызывает две функции, возвращающие Future[Int], и выводит на экран результат их суммы
object async2Def {
  import java.util.concurrent.Executors
  import scala.concurrent.{ExecutionContext, ExecutionContextExecutor, Future}
  def main(args: Array[String]): Unit = {
    val pool = Executors.newFixedThreadPool(4)
    implicit val executionContext: ExecutionContextExecutor = ExecutionContext.fromExecutor(pool)
    summing()
    pool.shutdown()
  }
  def summing()(implicit ec: ExecutionContext): Unit = {
    val resultFuture = Future.sequence(Seq(f1(1), f1(2)))
    resultFuture.map(results=>
      println(results(0)+results(1))
    )
  }
  def f1(int: Int)(implicit ec: ExecutionContext): Future[Int]={
    Future{
      int
    }
  }
}
