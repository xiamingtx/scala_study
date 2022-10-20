package chapter05

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    // (1) 可变参数
    def f1(str: String*): Unit = {
      println(str)
    }
    f1("alice")
    f1("aaa", "bbb", "ccc")

    // (2) 如果参数列表中存在多个参数 那么可变参数一般放置在最后
    def f2(str1: String, str2: String*): Unit = {
      println("str1: " + str1 + " str2: " + str2)
    }
    f2("alice")
    f2("alice", "aaa", "bbb")

    // (3) 参数默认值 一般将有默认值的参数放置在函数列表的后面
    def f3(name: String = "xm"): Unit = {
      println(s"my name is ${name}")
    }

    f3("cxk")
    f3()

    // (4) 带名参数
    def f4(name: String = "xm666", age: Int): Unit = {
      println(s"我是${name}, 今年${age}岁")
    }

    f4("xm", 20)
    f4(age=23,name="bob")
    f4(age=21)
  }
}
