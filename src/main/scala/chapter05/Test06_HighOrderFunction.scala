package chapter05

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }

    def fun():Int = {
      println("fun调用")
      1
    }

    val res: Int = f(123)
    println(res)

    fun()
    fun

    // 1. 函数可以作为值进行传递
    // 本质上还是面向对象的 f1和f2打印得到都是对象地址
    val f1: Int => Int = f
    val f2 = f _

    println(f1)
    println(f1(12))
    println(f2)
    println(f2(35))

    val f3 = fun
    val f4 = fun _
    val f5: () => Int = fun
    println(f3)
    println(f4)
    println(f5)

    // 2. 函数作为参数传递
    // 定义二元运算函数
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 12, 35))
    println(dualEval((a, b) => a + b, 12, 35))
    println(dualEval(_ + _, 12, 35))

    // 3. 函数可以作为函数的返回值返回
    def f6(): Int => Unit = {
      def f7(a: Int): Unit = {
        println("f7调用 " + a)
      }
      f7 // 将函数直接返回
    }

    val f7 = f6()
    println(f6())
    println(f7(25))

    println(f6()(25))
  }
}
