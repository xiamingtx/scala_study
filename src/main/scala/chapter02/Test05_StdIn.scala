package chapter02

import scala.io.StdIn

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    // 输入信息
    println("请输入您的大名:")
    val name: String = StdIn.readLine()
    println("请输入您的芳龄: ")
    val age: Int = StdIn.readInt()

    // 控制台打印输出
    println(s"${age}岁的${name}树脂666")
  }
}
