// 用嵌套风格定义包
package com {

  import com.xm.scala.Inner

  // 在外层包中定义单例对象
  object Outer {
    var out: String = "out"
    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }

  package xm {
    package scala{
      // 内层包中定义单例对象
      object Inner {
        val in: String = "in"
        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)
        }
      }
    }
  }
}

// 在同一文件中可以定义多个包
package aaa {
  package bbb {
    object Test01_Package {
      def main(args: Array[String]): Unit = {
        // 局部导入
        import com.xm.scala.Inner
        println(Inner.in)
      }
    }
  }
}
