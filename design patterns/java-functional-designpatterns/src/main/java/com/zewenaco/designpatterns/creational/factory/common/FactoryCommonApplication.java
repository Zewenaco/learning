package com.zewenaco.designpatterns.creational.factory.common;

import com.zewenaco.designpatterns.creational.factory.common.factory.SushiFactory;
import com.zewenaco.designpatterns.creational.factory.common.sushies.ISushi;
import com.zewenaco.designpatterns.creational.factory.common.sushies.features.CookType;
import com.zewenaco.designpatterns.creational.factory.common.sushies.features.SausageType;
import com.zewenaco.designpatterns.creational.factory.common.sushies.features.SushiType;

public class FactoryCommonApplication {

  public static void main(String[] args) {
    ISushi shrimpTempuraRoll =
        SushiFactory.instanceOfType(CookType.TEMPURA, SausageType.EEL, SushiType.SHRIMP);
    shrimpTempuraRoll.prepare();
    shrimpTempuraRoll.serve();
  }
}
