package com.zewenaco.designpatterns.creational.factory.common.factory;

import com.zewenaco.designpatterns.creational.factory.common.sushies.ISushi;
import com.zewenaco.designpatterns.creational.factory.common.sushies.SushiOctopus;
import com.zewenaco.designpatterns.creational.factory.common.sushies.SushiSalmon;
import com.zewenaco.designpatterns.creational.factory.common.sushies.SushiShrimp;
import com.zewenaco.designpatterns.creational.factory.common.sushies.features.CookType;
import com.zewenaco.designpatterns.creational.factory.common.sushies.features.SausageType;
import com.zewenaco.designpatterns.creational.factory.common.sushies.features.SushiType;

public class SushiFactory {
  public static ISushi instanceOfType(CookType cookType, SausageType sausageType, SushiType type) {
    if (type.equals(SushiType.SHRIMP)) {
      return new SushiShrimp(cookType, sausageType);
    } else if (type.equals(SushiType.SALMON)) {
      return new SushiSalmon(cookType, sausageType);
    } else if (type.equals(SushiType.OCTOPUS)) {
      return new SushiOctopus(cookType, sausageType);
    }
    throw new IllegalArgumentException("No support for type " + type.name());
  }
}
