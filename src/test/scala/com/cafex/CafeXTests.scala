package com.cafex

import org.scalatest.{BeforeAndAfter, FunSuite}

class CafeXTests extends FunSuite with BeforeAndAfter {
  val order = List("Cola", "Coffee", "Cheese Sandwich")

  test("system can calculate total bill without tips") {
    val parsedOrder = Parser.parseOrder(order)
    assert(BillCalculator.calculate(parsedOrder) == BigDecimal.apply(3.5))
  }
}
