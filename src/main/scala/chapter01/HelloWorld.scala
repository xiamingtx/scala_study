package chapter01

/**
 * object: 关键字 声明一个单例对象(伴生对象)
 *
 * @author 夏明
 * @version 1.0
 */
object HelloWorld {
  /*
    main 方法 从外部可以直接调用执行的方法
    def 方法名称(参数名称: 参数类型): 返回值类型 = { 方法体 }
  * */
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    System.out.println("Hello scala from java!")
  }
}
