package chapter06

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student = new Student9
    student.eat()
    student.sleep()
  }
}

// 定义父类
abstract class Person9 {
  // 非抽象属性
  val name: String = "person"

  // 抽象属性
  var age: Int

  // 非抽象方法
  def eat(): Unit = {
    println("person eat")
  }

  // 抽象方法
  def sleep(): Unit
}

// 定义具体的实现子类
class Student9 extends Person9 {
  // 实现抽象属性和方法
  override var age: Int = 18 // override可写可不写

  // override可写可不写
  override def sleep(): Unit = {
    println("student sleep")
  }

  // 重写非抽象属性和方法
  // 这里必须加override 同时我们不能将其改为var 非抽象属性(有初始值) 如果是var我们直接改就行 不需要override
  override val name: String = "student"

  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }
}
