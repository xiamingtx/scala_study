package chapter04

import scala.collection.immutable
import scala.language.postfixOps

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    // java for 语法: for (int i = 0; i < 10; i ++ ) { System.out.println("hello world"); }

    // 1. 范围遍历  to其实本质还是方法调用
    for (i <- 1 to 10) {
      println(i + ". hello world")
    }

    for (i <- 1.to(10)) {
      println(i + ". hello world")
    }

    println("=====================")
    // 左闭右开 inclusive 在Range中new对象时默认为false
    for (i <- Range(1, 10)) {
      println(i + ". hello world")
    }

    // 这样也可以实现 底层实际上也是Range
    for (i <- 1 until 10) {
      println(i + ". hello world")
    }

    println("=====================")
    // 2. 集合遍历 扩展讲解
    for (i <- Array(12, 34, 53)) {
      println(i)
    }

    for (i <- List(12, 34, 53)) {
      println(i)
    }

    for (i <- Set(12, 34, 53)) {
      println(i)
    }

    println("=====================")

    // 3. 循环守卫
    for (i <- 1 to 10) {
      if (i != 5) {
        println(i)
      }
    }

    // 改造 相当于把for循环体中的判断提前到推导式 这样类似java中continue的用法
    for (i <- 1 to 10 if i != 5) {
      println(i)
    }

    println("=====================")
    // 4. 循环步长
    for (i <- 1 to 10 by 2) {
      println(i)
    }

    // 实质
    for (i <- 1.to(10).by(2)) {
      println(i)
    }

    println("=====================")

    for (i <- 13 to 30 by 3) {
      println(i)
    }

    println("=====================")

   for (i <- 30 to 13 by -2) {
     println(i)
   }

    for (i <- 10 to 1 by -1) {
      println(i)
    }

    println("=====================")

    // 反转遍历
    for (i <- 10 to 1 reverse) {
      println(i)
    }

    println("=====================")

//    for (i <- 30 to 13 by 0) {
//      println(i)
//    } // error step不能为0

    // 这里可能会出现精度问题 所以不推荐使用Double 建议使用BigDecimal
    for (data <- 1.0 to 10.0 by 0.3) {
      println(data)
    }

    println("=====================")

    // 5. 循环嵌套
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println("i = " + i + ", j = " + j)
      }
    }

    // scala提供的方式
    for (i <- 1 to 4; j <- 1 to 5) {
      println("i = " + i + ", j = " + j)
    }

    println("=====================")
    // 6. 循环引入变量
    for (i <- 1 to 10) {
      val j = 10 - i
      println("i = " + i + ", j = " + j)
    }

    println("=====================")
    for (i <- 1 to 10; j = 10 - i) {
      println("i = " + i + ", j = " + j)
    }

    println("=====================")
    // 牛b写法 换行for
    for {
      i <- 1 to 10
      j = 10 - i
    } {
      println("i = " + i + ", j = " + j)
    }

    // 7. 循环返回值
    // scala里的for循环默认返回值都是空
    val a = for (i <- 1 to 10) {
      i
    }
    println("a = " + a)

    // 但是我们可以通过yield关键字 让for循环中的每一次返回一个值 组成一个集合(向量)
    // immutable.IndexedSeq[Int] 这是一个trait 类似interface vector是它的具体实现 所以打印出来是vector
    val b: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i * i
    println("b = " + b)
  }
}
