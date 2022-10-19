package chapter04

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test05_WhileLoop {
  def main(args: Array[String]): Unit = {
    // 在Scala 中 while循环应用场景比较少 所以本节篇幅较短

    // while
    var a: Int = 10
    while (a >= 1) {
      println("this is a while loop: " + a)
      a -= 1
    }

    var b: Int = 0
    do {
      println("this is a do-while loop: " + b)
      b -= 1
    } while (b > 0)
  }
}
