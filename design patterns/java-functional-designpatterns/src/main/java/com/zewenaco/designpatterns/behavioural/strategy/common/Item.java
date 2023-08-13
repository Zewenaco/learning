package com.zewenaco.designpatterns.behavioural.strategy.common;

import java.math.BigDecimal;

public class Item {
  private final long id;
  private final BigDecimal price;

  public Item(long id, BigDecimal price) {
    this.id = id;
    this.price = price;
  }

  public long getId() {
    return id;
  }

  public BigDecimal getPrice() {
    return price;
  }
}
