package chapter02

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test03_Identifier {
  def main(args: Array[String]): Unit = {
    // (1) 以字母或者下划线开头 后接 字母、数字、下划线
    val hello: String = ""
    var hello123 = ""
    val _abc = 123

    // (2) 以操作符开头 且只包含操作符(+ - * / # !等)
    // val h-b = "" idea不报错 但是错
    val -+/% = "hello"
    println(-+/%)

    // (3) 用反引号`...`包含的任意字符串 即使是Scala关键字 (39个) 也可以
    val `if` = "hello world"
    println(`if`)
  }
}
