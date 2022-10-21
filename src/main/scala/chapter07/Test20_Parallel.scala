package chapter07

import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

/**
 *
 *
 * @author 夏明
 * @version 1.0
 */
object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    val res: immutable.IndexedSeq[Long] = (1 to 100).map(
      x => Thread.currentThread().getId
    )
    println(res)


    // 并行计算
    val res2: ParSeq[Long] = (1 to 100).par.map(
      x => Thread.currentThread().getId
    )
    println(res2)
  }
}
