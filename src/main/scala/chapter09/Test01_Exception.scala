package chapter09

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try {
      val n = 10 / 1
    } catch {
      case e: ArithmeticException => {
        println("发生算术异常")
      }
      case e: Exception => {
        println("发生一般异常")
      }
    } finally {
      println("处理结束")
    }
  }
}
