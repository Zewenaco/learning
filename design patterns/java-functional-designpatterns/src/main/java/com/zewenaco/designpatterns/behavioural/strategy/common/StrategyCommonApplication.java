package com.zewenaco.designpatterns.behavioural.strategy.common;

import java.math.BigDecimal;

public class StrategyCommonApplication {

  public static void main(String[] args) {
    final PriceCalculatorFactory factory = new PriceCalculatorFactory();
    final Item newItem = new Item(1L, new BigDecimal("12.99"));
    final DeliveryPriceCalculator priceCalculator = factory.priceCalculatorFor(Plan.BASIC);
    System.out.println("Delivery price is " + priceCalculator.priceFor(newItem));
  }
}
