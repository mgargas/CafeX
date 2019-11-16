package com.cafex

import com.cafex.Model.CafeItem

object BillCalculator {
  def calculate(order: List[CafeItem]): BigDecimal = {
    order.map(_.price).foldLeft(BigDecimal.apply(0))(_ + _)
  }
}
