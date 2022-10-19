package chapter04

import scala.io.StdIn

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    println("请输入您的年龄： ")
    val age: Int = StdIn.readInt()

    // 1. 单分支
    if (age >= 18) {
      println("成年")
    }

    println("==================")

    // 2. 双分支
    if (age >= 18) {
      println("成年")
    } else {
      println("未成年")
    }

    println("==================")

    // 3. 多分支
    if (age <= 6) {
      println("童年")
    } else if (age < 18) {
      println("青少年")
    } else if (age < 35) {
      println("青年")
    } else if (age < 60) {
      println("中年")
    } else{
      println("老年")
    }

    println("==================")
    // 4. 分支语句的返回值  这里String也可以改成Unit 就只返回一个()
    val res: Any = if (age <= 6) {
      println("童年")
      "童年"
    } else if (age < 18) {
      println("青少年")
      "青少年"
    } else if (age < 35) {
      println("青年")
      "青年"
    } else if (age < 60) {
      println("中年")
      age
    } else{
      println("老年")
      age
    }
    println("result: " + res)

    // java中三元运算符 a?b:c
    val res1: String = if (age >= 18) {
      "成年"
    } else {
      "未成年"
    }

    val res2:String = if (age >= 18) "成年" else "未成年"

    println("==================")

    // 5. 嵌套分支
    if (age >= 18) {
      println("成年")
      if (age >= 35) {
        if (age >= 60) {
          println("老年")
        } else {
          println("中年")
        }
      } else {
        println("青年")
      }
    } else {
      println("未成年")
      if (age <= 6) {
        println("童年")
      } else {
        println("青少年")
      }
    }
  }
}
