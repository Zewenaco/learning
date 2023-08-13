package com.zewenaco.designpatterns.creational.factory.common.sushies;

import com.zewenaco.designpatterns.creational.factory.common.sushies.features.CookType;
import com.zewenaco.designpatterns.creational.factory.common.sushies.features.SausageType;

public class SushiSalmon implements ISushi {

  protected CookType cookType;
  protected SausageType sausageType;

  public SushiSalmon(CookType cookType, SausageType sausageType) {
    this.cookType = cookType;
    this.sausageType = sausageType;
  }

  @Override
  public void prepare() {
    System.out.printf(
        "Preparing %s %s ROLL and %s sauce%n",
        this.getClass().getSimpleName(), cookType.name(), sausageType.name());
  }

  @Override
  public void serve() {
    System.out.printf(
        "Serving %s %s ROLL and %s sauce%n",
        this.getClass().getSimpleName(), cookType.name(), sausageType.name());
  }
}
