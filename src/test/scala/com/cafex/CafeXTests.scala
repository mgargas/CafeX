package com.cafex

import org.scalatest.{BeforeAndAfter, FunSuite}

class CafeXTests extends FunSuite with BeforeAndAfter {

  test("system can calculate total bill for only beverages") {
    val order = List("Cola", "Coffee", "Coffee")
    val parsedOrder = Parser.parseOrder(order)
    assert(BillCalculator.calculate(parsedOrder) == BigDecimal.apply(2.5))
  }
  test("system can calculate total bill with 10% charge when the order contains any cold food") {
    val order = List("Cola", "Coffee", "Cheese Sandwich")
    val parsedOrder = Parser.parseOrder(order)
    assert(BillCalculator.calculate(parsedOrder) == BigDecimal.apply(3.85))
  }
  test("system can calculate total bill with 20% charge when the order contains any hot food") {
    val order = List("Cola", "Coffee", "Steak Sandwich")
    val parsedOrder = Parser.parseOrder(order)
    assert(BillCalculator.calculate(parsedOrder) == BigDecimal.apply(7.20))
  }
}
