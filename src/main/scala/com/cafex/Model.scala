package com.cafex

object Model {

  sealed trait Temperature

  sealed trait CafeItem {
    def name: String

    def temperature: Temperature

    def price: BigDecimal
  }

  sealed trait Food extends CafeItem

  sealed trait Beverage extends CafeItem

  final case class Cola(override val name: String = "Cola",
                        override val temperature: Temperature = Cold,
                        override val price: BigDecimal = BigDecimal.apply(0.5))
    extends Beverage

  final case class Coffee(override val name: String = "Coffee",
                          override val temperature: Temperature = Hot,
                          override val price: BigDecimal = BigDecimal.apply(1))
    extends Beverage

  final case class CheeseSandwich(override val name: String = "Cheese Sandwich",
                                  override val temperature: Temperature = Cold,
                                  override val price: BigDecimal = BigDecimal.apply(2))
    extends Food

  final case class SteakSandwich(override val name: String = "Steak Sandwich",
                                 override val temperature: Temperature = Hot,
                                 override val price: BigDecimal = BigDecimal.apply(4.5))
    extends Food

  final case object Hot extends Temperature

  final case object Cold extends Temperature

}
