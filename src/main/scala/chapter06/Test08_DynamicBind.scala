package chapter06

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    val student: Person8 = new Student8
    println(student.name) // 动态绑定 比java做的更加彻底
    student.hello()
  }
}

class Person8 {
  val name: String = "person"
  def hello(): Unit = {
    println("hello person")
  }
}

class Student8 extends Person8 {
  // Scala中对父亲的name做重写时必须使用override
  override val name: String = "student"

  override def hello(): Unit = {
    println("hello student")
  }
}