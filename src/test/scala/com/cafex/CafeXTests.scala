package com.cafex

import org.scalatest.{BeforeAndAfter, FunSuite}
class CafeXTests extends FunSuite with BeforeAndAfter {
  val order = Seq("Cola", "Coffee", "Cheese Sandwich")

  test("system can calculate total bill without tips")(pending)
}
