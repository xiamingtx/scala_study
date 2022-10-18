package chapter02

import chapter01.Student

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // 1. 整数类型
    val a1: Byte = 127
    val a2: Byte = -128

//    val a2: Byte = 128 // error
    val a3 = 12 // 整数默认类型为Int
    val a4: Long = 1231345641213L // 长整型数值定义

    val b1: Byte = 10
    val b2: Byte = 10 + 20// 编译器提示应该使用Int(Idea的scala插件提示不到位) 但是事实上对于本身的scala编译器是可以处理的
    println(b2)

    // val b3:Byte = (b1 + 20) // 这里真的不能通过了 有变量参与运算时，会先将b1进行类型转换
    val b3:Byte = (b1 + 20).toByte // 这样是可以的 进行了强制类型转换
    println(b3)

    // 2. 浮点类型 默认是double
    val f1: Float = 1.2345f
    val f2 = 1.23456

    // 3. 字符类型
    val c1: Char = 'a'
    println(c1)

    val c2: Char = '9'
    println(c2)

    // 特殊字符
    val c3: Char = '\t' // 制表符
    val c4: Char = '\n' // 换行符
    println("abc" + c3 + "def")
    println("abc" + c4 + "def")

    // 转义字符
    val c5 = '\\' // 表示\自身
    val c6 = '\"' // 表示'
    println("abc" + c5 + "def")
    println("abc" + c6 + "def")

    // 字符变量底层保存ASCII码
    val i1: Int = c1
    println("i1: " + i1)
    val i2:Int = c2
    println("i2: " + i2)

    val c7: Char = (i1 + 1).toChar
    println(c7)
    val c8: Char = (i2 - 1).toChar
    println(c8)

    // 4. 布尔类型
    val isTrue: Boolean = true
    println(isTrue)

    // 5. 空类型
    // 5.1 空值Unit
    def m1(): Unit = {
      println("m1被调用执行")
    }

    val a = m1()
    println("a: " + a)

    // 5.2 空引用Null
//    val n: Int = null // error
    var student: Student = new Student("alice", 20)
    student = null
    println(student)

    // 5.3 Nothing 这里注意Nothing是所有的子类
    def m2(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException
      else
        return n
    }

    val b: Int = m2(1)
    println("b: " + b)
    val res: Int = m2(0)
  }
}
