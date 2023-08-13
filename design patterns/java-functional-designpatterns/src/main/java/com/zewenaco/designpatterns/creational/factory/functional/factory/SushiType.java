package com.zewenaco.designpatterns.creational.factory.functional.factory;

import com.zewenaco.designpatterns.creational.factory.common.sushies.ISushi;
import com.zewenaco.designpatterns.creational.factory.common.sushies.SushiOctopus;
import com.zewenaco.designpatterns.creational.factory.common.sushies.SushiSalmon;
import com.zewenaco.designpatterns.creational.factory.common.sushies.SushiShrimp;
import com.zewenaco.designpatterns.creational.factory.common.sushies.features.CookType;
import com.zewenaco.designpatterns.creational.factory.common.sushies.features.SausageType;

public enum SushiType {
  SHRIMP(SushiShrimp::new),
  SALMON(SushiSalmon::new),
  OCTOPUS(SushiOctopus::new);

  public final SushiFactory<CookType, SausageType, ISushi> factory;

  SushiType(SushiFactory<CookType, SausageType, ISushi> factory) {
    this.factory = factory;
  }
}
