package com.zewenaco.designpatterns.behavioural.strategy.functional;

import com.zewenaco.designpatterns.behavioural.strategy.common.Item;
import java.math.BigDecimal;

  public class StrategyFunctionalApplication {

    public static void main(String[] args) {

      final Item newItem = new Item(1L, new BigDecimal("12.99"));
      System.out.println("Delivery price BASIC is " +
              Plan.BASIC.deliveryPrice.apply(newItem));
      System.out.println("Delivery price PREMIUM is " +
              Plan.PREMIUM.deliveryPrice.apply(newItem));
      System.out.println("Delivery price BUSINESS is " +
              Plan.BUSINESS.deliveryPrice.apply(newItem));
    }
  }
