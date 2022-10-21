package chapter07

import scala.collection.mutable

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2 = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)

    println(map1 ++ map2) // 覆盖 map2覆盖map1

    val map3 = map1.foldLeft(map2)((mergedMap, kv) => {
      val key = kv._1
      val value = kv._2
      mergedMap(key) = mergedMap.getOrElse(key, 0) + value
      mergedMap
    })

    println(map3)
  }
}
