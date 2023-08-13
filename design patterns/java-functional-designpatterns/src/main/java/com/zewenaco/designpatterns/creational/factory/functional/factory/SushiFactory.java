package com.zewenaco.designpatterns.creational.factory.functional.factory;

@FunctionalInterface
public interface SushiFactory<CookType, SausageType, ISushi> {
  public ISushi apply(CookType cookType, SausageType sausageType);
}
