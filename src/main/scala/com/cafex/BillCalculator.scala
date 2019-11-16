package com.cafex

import com.cafex.Model.{CafeItem, Food, Hot}

object BillCalculator {
  def calculate(order: List[CafeItem]): BigDecimal = {
    def calculateNoServiceCharge = order.map(_.price).foldLeft(BigDecimal.apply(0))(_ + _)

    if (order.exists {
      case item: Food if item.temperature == Hot => true
      case _ => false
    }) calculateNoServiceCharge.*(1.20).setScale(2, BigDecimal.RoundingMode.UP)

    else if (order.exists {
      case _: Food => true
      case _ => false
    }) calculateNoServiceCharge.*(1.10).setScale(2, BigDecimal.RoundingMode.UP)
    else calculateNoServiceCharge.setScale(2, BigDecimal.RoundingMode.UP)
  }
}
