package chapter06

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("alice", "123456")
    user.insert()
  }
}

// 用户类
class User(val name: String, val password: String)

trait UserDao {
  // 定义自身类型为User 类似依赖注入
  _: User =>

  // 向数据库插入数据
  def insert(): Unit = {
    println(s"insert into db: ${this.name}")
  }
}

// 定义注册用户
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao
