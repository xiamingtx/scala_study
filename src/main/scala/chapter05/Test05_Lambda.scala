package chapter05

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    // 可以把匿名函数作为一个值赋给一个变量
    val fun = (name: String) => { println(name) }
    fun("xm")

    println("========================")

    // 定义一个函数 以函数作为参数输入
    def f(func: String => Unit): Unit = {
      func("xm6666")
    }

    f(fun)
    f( (name: String) => { println(name) } )
    println("========================")

    // 匿名函数的简化原则
    // (1) 参数的类型可以省略 会根据形参进行自动推导
    f ( (name) => { println(name) } )

    // (2) 类型省略之后 发现只有一个参数 则圆括号可以省略 其他情况: 没有参数和参数数 > 1的永远不能省略圆括号
    f ( name => { println(name) } )

    // (3) 匿名函数如果只有一行 则大括号也可以省略
    f ( name => println(name) )

    // (4) 如果参数只出现一次, 则参数省略且后面参数可以用_代替
    f ( println(_) )

    // (5) 如果可以推断出 当前传入的println是一个函数体 而不是调用语句 可以直接省略下划线
    f( println )

    // 实际示例 定义一个"二元运算"函数, 只操作1和2两个数 但是具体运算通过参数传入
    def dualFunctionOneAndTwO(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b

    println(dualFunctionOneAndTwO(add))
    println(dualFunctionOneAndTwO(minus))

    // 匿名函数简化
    println(dualFunctionOneAndTwO((a: Int, b: Int) => a + b))
    println(dualFunctionOneAndTwO((a:Int, b: Int) => a - b))

    println(dualFunctionOneAndTwO((a, b) => a + b))
    println(dualFunctionOneAndTwO(_ + _))
    println(dualFunctionOneAndTwO(_ - _))

    println(dualFunctionOneAndTwO((a, b) => b - a))
    println(dualFunctionOneAndTwO(-_ + _))


  }
}
