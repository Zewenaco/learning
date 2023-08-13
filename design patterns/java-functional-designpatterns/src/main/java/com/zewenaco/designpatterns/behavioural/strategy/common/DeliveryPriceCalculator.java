package com.zewenaco.designpatterns.behavioural.strategy.common;

import java.math.BigDecimal;

public interface DeliveryPriceCalculator {
  BigDecimal priceFor(Item item);
}
