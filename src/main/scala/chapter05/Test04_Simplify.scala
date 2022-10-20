package chapter05

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
// 函数至简原则
object Test04_Simplify {
  def main(args: Array[String]): Unit = {

    def f0(name: String): String = {
      return name
    }

    println(f0("xm"))

    println("========================")

    // (1) return 可以省略 Scala会使用函数体的最后一行代码作为返回值
    def f1(name: String): String = {
      name
    }

    println(f1("xm"))

    println("========================")

    // (2) 函数体中只有一行代码 可以省略花括号
    def f2(name: String): String = name
    println(f2("xm"))

    println("========================")

    // (3) 返回值类型如果能够推断出来 那么可以省略(:和返回值类型一起省略)
    // 类似数学上 f(x) = x  函数式编程 关注的是数据的映射关系
    def f3(name: String) = name
    println(f3("xm"))

    println("========================")

    // (4) 如果有return 则不能省略返回值类型 必须指定
    // method f4 has return statement; needs result type
    //      return name
//    def f4(name: String) = {
//      return name
//    }
//
//    println(f4("xm"))
//
//    println("========================")

    // (5) 如果函数明确声明Unit 那么即使函数体中使用return关键字也不起作用
    def f5(name: String): Unit = {
      return name
    }

    println(f5("xm"))

    println("========================")

    // (6) Scala如果期望是无返回值类型 可以省略等号
    // 提示Procedure syntax in method definition  我们通常把它叫做过程
    def f6(name: String) {
      println(name)
    }

    println(f6("xm"))

    println("========================")

    // (7) 如果函数无参 但是声明了参数列表 那么调用时 小括号 可加可不加
    def f7():Unit = {
      println("xm")
    }

    f7()
    f7

    println("===============")

    // (8) 如果函数没有参数列表 那么小括号可以省略 调用时小括号必须省略
    def f8: Unit = {
      println("xm")
    }

    f8

    println("===============")

    // (9) 如果不关心名称 只关心处理逻辑 那么函数名 (def) 可以省略
    def f9(name: String): Unit = {
      println(name)
    }

    // 匿名函数 lambda表达式
    (name: String) => { println(name) }

    println("===============")
  }
}
