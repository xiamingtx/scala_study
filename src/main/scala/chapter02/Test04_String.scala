package chapter02

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test04_String {
  def main(args: Array[String]): Unit = {
    // (1) 字符串, 通过 + 号连接
    val name:String = "xm"
    val age:Int = 20
    println(age + "岁的" + name + "树脂666")

    // *用于将一个字符串复制多次拼接
    println(name * 3)

    // (2) printf用法: 字符串, 通过 % 传值
    printf("%d岁的%s树脂666", age, name)
    println()

    // (3) 字符串模板 (插值字符串) : 通过$获取变量值 字符串前加上s
    println(s"${age}岁的${name}树脂666")

    val num = 2.3456 // 默认为Double
    val num1: Float = 2.3456f
    println(f"The num is ${num}%2.2f") // 字符串前加f 格式化模板字符串
    println(raw"The num is ${num}%2.2f") // 字符串前加raw 所有都按照初始值输出不做转义

    // 三引号表示字符串 保持字符串的原格式输出
    val sql = s"""
       |select *
       |from
       |  student
       |where
       |  name = ${name}
       |and
       |  age > ${age}
       |""".stripMargin
    println(sql)
  }
}
