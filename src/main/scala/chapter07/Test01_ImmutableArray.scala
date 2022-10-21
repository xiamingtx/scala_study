package chapter07

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    // 1. 创建数组
    var arr: Array[Int] = new Array[Int](5)
    // 另一种创建方式
    val arr2 = Array(12, 37, 42, 58, 97) // 实际上是调用伴生对象的apply方法

    println(arr)

    // 2. 访问数组中元素
    println(arr(0))
    println(arr(1))
    println(arr(4))
//    println(arr(5)) // error:  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
    arr(0) = 12 // arr(0) 实质上是 arr.apply(0)  这是一个stub method 存根方法 编译器会在运行时自动做填入
    arr(4) = 57 // arr(4) = 57 实质上是arr.update(4)   同上
    println(arr(0))
    println(arr(1))
    println(arr(4))


    println("=============")

    // 3. 数组的遍历
    // 1) 普通for循环
    for (i <- 0 until arr.length) {
      println(arr(i))
    }

    println("=============")

    for (i <- arr.indices) println(arr(i))

    println("=============")

    // 2) 直接遍历所有元素 增强for循环
    for (elem <- arr2) println(elem)

    println("=============")

    // 3) 迭代器
    val iter = arr2.iterator
    while (iter.hasNext) println(iter.next())

    println("=============")

    // 4) 调用foreach方法
    arr2.foreach(println)

    println("=============")

    // 将所有数据以分隔符连接成字符串
    println(arr2.mkString("--"))

    println("=============")

    // 4. 添加元素  使用新的数组返回
    val newArr = arr2.:+(73)
    println(arr2.mkString("--"))
    println(newArr.mkString("--"))

    val newArr2 = newArr.+:(30)
    println(newArr2.mkString("--"))

    val newArr3 = newArr2 :+ 15
    val newArr4 = 19 +: 29 +: newArr3 :+ 26 :+ 73
    println(newArr4.mkString(", "))
  }
}
