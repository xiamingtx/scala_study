package chapter07

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    // 1. 创建map
    val map1: Map[String, Int] = Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map1) // Map(a -> 13, b -> 25, hello -> 3)
    println(map1.getClass) // class scala.collection.immutable.Map$Map3

    println("======================")

    // 2. 遍历元素
    map1.foreach(println)
    /*
    (a,13)
    (b,25)
    (hello,3)
     */

    println("======================")
    map1.foreach((kv: (String, Int)) => println(kv)) // 同上

    println("======================")
    // 3. 取map中所有的key或者Value
    for (key <- map1.keys) {
      println(s"$key ---> ${map1.get(key)}") // a ---> Some(13) 其他类似
    }

    // 4. 访问某一个key的value
    println("a: " + map1.get("a").get) // 13
    println("c: " + map1.get("c")) // None
    println("c: " + map1.getOrElse("c", 0)) // 可以设定默认值

    println(map1("a")) // 如果不存在 会抛异常
  }
}
