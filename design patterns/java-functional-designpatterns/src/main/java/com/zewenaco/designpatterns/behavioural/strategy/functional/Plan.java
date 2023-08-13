package com.zewenaco.designpatterns.behavioural.strategy.functional;

import com.zewenaco.designpatterns.behavioural.strategy.common.Item;
import java.math.BigDecimal;
import java.util.function.Function;

    public enum Plan {
      BASIC(deliveryPriceWithPercentageSurplus("0.25")),
      PREMIUM(deliveryPriceWithPercentageSurplus("0.015")),
      BUSINESS(deliveryPriceWithPercentageSurplus(("0.0")));

      private static Function<Item, BigDecimal> deliveryPriceWithPercentageSurplus(
          String percentageSurplus) {
        return item ->
            item.getPrice()
                    .multiply(new BigDecimal(percentageSurplus))
                    .add(new BigDecimal("1.0"));
      }

      public final Function<Item, BigDecimal> deliveryPrice;

      Plan(Function<Item, BigDecimal> deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
      }
    }
