package chapter06

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test04_ClassForAccess {

}

// 定义一个父类
class Person {
  private var idCard: String = "3523566"
  protected var name: String = "xm"
  var sex: String = "female"
  private[chapter06] var age: Int = 18

  def printInfo(): Unit = {
    println(s"Person: $idCard $name $sex $age")
  }
}