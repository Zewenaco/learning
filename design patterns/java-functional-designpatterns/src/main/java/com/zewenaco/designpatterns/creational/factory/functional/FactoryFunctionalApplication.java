package com.zewenaco.designpatterns.creational.factory.functional;

import com.zewenaco.designpatterns.creational.factory.common.sushies.ISushi;
import com.zewenaco.designpatterns.creational.factory.common.sushies.features.CookType;
import com.zewenaco.designpatterns.creational.factory.common.sushies.features.SausageType;
import com.zewenaco.designpatterns.creational.factory.functional.factory.SushiType;

public class FactoryFunctionalApplication {

  public static void main(String[] args) {
    ISushi sushiDish = SushiType.SHRIMP.factory.apply(CookType.NIKKEI, SausageType.BITTERSWEET);
    sushiDish.prepare();
    sushiDish.serve();

    sushiDish = SushiType.OCTOPUS.factory.apply(CookType.TEMPURA, SausageType.EEL);
    sushiDish.prepare();
    sushiDish.serve();

    sushiDish = SushiType.SALMON.factory.apply(CookType.NIGIRI, SausageType.SPICY);
    sushiDish.prepare();
    sushiDish.serve();
  }
}
