package chapter06

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test11_Object {
  def main(args: Array[String]): Unit = {
//    val student = new Student11("alice", 18)
//    student.printInfo()

    val student1 = Student11.newStudent("alice", 18)
    student1.printInfo()

    val student2 = Student11.apply("alice", 18)
    student2.printInfo()

    val student3 = Student11("bob", 19) // 实际上是直接调用伴生对象的apply方法
    student3.printInfo()
  }
}

// 定义类 主构造器私有化
class Student11 private (val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: name = $name, age= $age, school = ${Student11.school}")
  }
}

// 伴生对象
object Student11 {
  val school: String = "atguigu"

  // 定义一个类的对象实例的创建方法
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}