package chapter01

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
class Student(name:String,var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

// 引入伴生对象
object Student {
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bob = new Student("Bob", 23)

    alice.printInfo()
    bob.printInfo()
  }
}
