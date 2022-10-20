package chapter06

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test04_Access {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person: Person = new Person()
//    person.idCard // error
//    println(person.name) // error
    println(person.age)
    println(person.sex)

    person.printInfo()

    val worker: Worker = new Worker()
//    worker = new Worker()
//    worker.age = 23
    worker.printInfo()
  }
}

// 定义一个子类
class Worker extends Person {
  override def printInfo(): Unit = {
//    println(idCard) // error
    name = "bob"
    age = 25
    sex = "male"

    println(s"Worker: $name $sex $age")
  }
}