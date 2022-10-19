package chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks._ // 类似java中引入java.util.*      这里的._其实就是全部引入
/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test06_Break {
  def main(args: Array[String]): Unit = {
    // 1. 采用抛出异常的方法 退出循环
     try {
       for (i <- 0 until 5) {
         if (i == 3)
           throw new RuntimeException
         println(i)
       }
     } catch {
       case e: Exception => // 什么都不做 只是退出循环
     }

    println("这是循环外的代码")

    // 2. 使用Scala中的Breaks类的break方法 实现异常的抛出和捕捉
    // 我们可以点进去看源码 实际上就是通过抛异常和try catch来实现的
    Breaks.breakable(
      for (i <- 0 until 5) {
        if (i == 3)
          Breaks.break()
        println(i)
      }
    )

    println("这是循环外的代码")

    // 简化
    breakable(
      for (i <- 0 until 5) {
        if (i == 3)
          break()
        println(i)
      }
    )

    println("这是循环外的代码")
  }
}
