package chapter05

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
    // 定义函数
    def sayHi(name: String): Unit = {
      println("hi, " + name)
    }

    // 调用函数
    sayHi("alice")

    // 调用对象方法  ps: 这里因为是可见的 可以直接调用 否则就需要有对象才能调用
    Test01_FunctionAndMethod.sayHi("bob")

    // 获取方法返回值
    val res = Test01_FunctionAndMethod.sayHello("cary")
    println(res)
  }

  // 定义对象的方法
  // 和上边定义域不一样
  def sayHi(name: String): Unit = {
    println("Hi, " + name)
  }

  def sayHello(name: String): String = {
    println("Hello, " + name)
    return "Hello"
  }
}
