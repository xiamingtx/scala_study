package chapter03

import scala.language.postfixOps

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    // 1. 算术运算符
    val res1: Int = 10 / 3
    println(res1)

    val res2: Double = 10 / 3
    println(res2)

    val res3: Double = 10.0 / 3
    println(res3.formatted("%5.2f"))

    val res4: Int = 10 % 3
    println(res4)

    val res5: Int = -10 % 3
    println(res5)

    // 2. 比较运算符
    val s1: String = "hello"
    val s2: String = new String("hello")
    val s3: String = "hello"

    println(s1 == s2) // 判断值是否相等
    println(s1.equals(s2)) // 判断值是否相等
    println(s1.eq(s2)) // 判断引用地址是否相等
    println(s1.eq(s3))

    // 3. 逻辑运算符
    def m(n: Int): Int = {
      println("被调用")
      return n
    }

    val n = 1
    println((4 > 5) && m(n) > 0)
    println((4 < 5) && m(n) > 0)

    // 判断一个字符串是否为空
    def isNotEmpty(str: String): Boolean = {
      return str != null &&  ! "".equals(str.trim)
    }

    println(isNotEmpty(null))

    // 4. 赋值运算符       Scala抛弃了 ++i, i ++ 这种自增操作
//    var b: Byte = 10
    // b += 1 // 在Scala中不会进行强转 error
    var i: Int = 12
    i += 1
    println(i)

    // 5. 位运算符
    val a: Byte = 60
    println(a << 3) // 自动转换为int
    println(a >> 2)

    val b: Short = -13
    println(b << 2)
    println(b >> 2)
    println(b >>> 2)

    // 6. Scala中运算符的本质 -> 对象的方法调用 一切皆对象
    val n1: Int = 12
    val n2: Int = 37
    println(n1 + n2)
    println(n1.+(n2))
    println(1.34 * 25)
    println(1.34.*(25))

    println(7.5 toInt)
  }
}
