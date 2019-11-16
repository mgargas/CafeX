package com.cafex
import Model.CafeItem
object Parser {
  def parseOrder(items: Iterable[String]): List[CafeItem] = {
    items.flatMap(itemName => Model.cafeItems.get(itemName)).toList
  }
}
