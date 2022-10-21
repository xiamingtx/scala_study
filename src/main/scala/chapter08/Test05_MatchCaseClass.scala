package chapter08

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student = new Student1("alice", 18)
    // 针对对象实例的内容进行匹配
    val result = student match {
      case Student1("alice", 18) => "Alice, 18"
      case _ => "Else"
    }

    println(result)
  }
}

// 定义样例类 默认构造方法中的参数都是属性 不需要加val 伴生对象自动生成(包括apply和unapply)
case class Student1(name: String, age: Int)
