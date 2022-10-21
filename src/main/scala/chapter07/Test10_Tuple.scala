package chapter07

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    // Scala中元组不可变 而且只能22个数据
    // 1. 创建元组
    val tuple: (String, Int, Char, Boolean) = ("hello", 100, 'a', true)
    println(tuple)

    // 2. 访问数据
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)

    println(tuple.productElement(1)) // 对应索引位置上的值 从0开始 这里即是100

    println("==================")

    // 3. 遍历元组数据
    for (elem <- tuple.productIterator) println(elem)

    println("==================")

    // 4. 嵌套元组
    val mulTuple = (12, 0.3, "hello", (23, "scala"), 29)
    println(mulTuple._4._2)
  }
}
