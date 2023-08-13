package com.zewenaco.designpatterns.behavioural.strategy.common;

import java.math.BigDecimal;

public class PremiumDeliveryPriceCalculator implements DeliveryPriceCalculator {

  @Override
  public BigDecimal priceFor(Item item) {
    return item.getPrice().multiply(new BigDecimal("0.015")).add(new BigDecimal("1.0"));
  }
}
