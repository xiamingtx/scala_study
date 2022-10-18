package chapter02

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    // 1. 自动类型转换
    // (1) 自动提升原则: 有多种数据类型混合运算时 系统首先自动将所有数据转换成精度大的那种数据类型 然后再做计算
    val a1: Byte = 10
    val b1: Long = 2353
    val res1: Long = a1 + b1
    val res2: Int = (a1 + b1).toInt // 强转

    // (2) 把精度大的数值
    val a2: Byte = 10
    val b2: Int = a2
//    val c2: Byte = b2 // error
    // (3) (byte, short) 和 char之间不会相互自动转换
    val a3: Byte = 10
    val b3: Char = 'b'
//    val c3: Byte = b3 // error
    val c3: Int = b3
    println(c3)
    // (4) byte, short, char 他们三者可以计算 在计算时首先转换为Int类型
    val a4: Byte = 12
    val b4: Short = a4
    val c4: Char = 'c'
    val res3: Int = a4 + b4
    println(res3)
    val res4: Int = a4 + b4 + c4
    println(res4)

    // 2. 强制类型转换
    // (1) 将数据由高精度转换为低精度 就需要使用到强制类型转换
    val n1:Int = -2.5.toInt // 向0取整
    println("n1: " + n1)

    // (2) 强转符号只针对最近的操作数有效 往往会使用小括号提升优先级
    val n2: Int = 2.6.toInt + 3.7.toInt
    val n3: Int = (2.6 + 3.7).toInt
    println("n2: " + n2)
    println("n3: " + n3)

    // 3. 数值类型和String类型转换
    // (1) 数值转String
    val n: Int = 27
    val s: String = n + ""
    println(s)

    // (2) String转数值
    val m: Int = "12".toInt
    val f: Float = "12.3".toFloat
//    val f2: Int = "12.3".toInt // 运行错误
    val f2: Int = "12.3".toDouble.toInt
  }
}
