package chapter05

import scala.annotation.tailrec

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5))
  }

  // 递归实现计算阶乘
  def fact(n: Int): Int = {
    if (n == 0) return 1
    fact(n - 1) * n
  }

  // 尾递归实现 减少对栈资源的占用(始终只有一个方法压栈)
  // 尾递归实现依赖于编译器 所以在java等语言不支持 一般函数式语言都会进行支持
  def tailFact(n: Int): Int = {
    // @tailrec 可以保证接下来是一个尾递归
    @tailrec
    def loop(n: Int, currentResult: Int): Int = {
      if (n == 0) return currentResult
      loop(n - 1, currentResult * n)
    }
    loop(n, 1)
  }
}
