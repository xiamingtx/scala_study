package chapter02

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
/*
128: Int类型 占据4个字节 32位
原码 0000 0000 0000 0000 0000 0000 1000 0000
补码 0000 0000 0000 0000 0000 0000 1000 0000

截取最后一个字节 Byte
得到补码 1000 0000
表示最大的负数 -128

130: Int类型 占据4个字节 32位
原码 0000 0000 0000 0000 0000 0000 1000 0010
补码 0000 0000 0000 0000 0000 0000 1000 0010

截取最后一个字节 Byte
得到补码 1000 0010
对应原码 1111 1110
表示 -128 + 2 = -126
 */
object Test09_Problem_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    val n: Int = 128
    val b: Byte = n.toByte
    println(b)
    val n2: Int = 130
    val b2: Byte = n2.toByte
    println(b2)
  }
}
