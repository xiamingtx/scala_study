package chapter06

import scala.beans.BeanProperty

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test03_Class {
  def main(args: Array[String]): Unit = {
    // 创建一个对象
    val student = new Student()
//    student.name // error, 不能访问private属性
    println(student.age)
    println(student.sex)
    student.sex = "female"
    println(student.sex)
  }
}

// 定义一个类
class Student {
  // 定义属性(Scala中没有public关键字)
  private var name: String = "alice"
  // Scala中属性和方法 默认访问权限为public 但是public的属性 底层实际为private 但是我们操作属性时Scala会去隐式地去调用getter和setter
  // 但是为了兼容 java的一些框架要求(反射需要使用getter/setter) 有时候需要使用注解显示创建getter setter等
  @BeanProperty
  var age: Int = _
  var sex:String = _ // _表示定义空值 此时就要用var修饰

}
