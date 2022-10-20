/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
package object chapter06 {
  // 定义当前包共享的属性和方法
  val commonValue = "xm"
  def commonMethod(): Unit = {
    println(s"你好, 我是${commonValue}")
  }
}
