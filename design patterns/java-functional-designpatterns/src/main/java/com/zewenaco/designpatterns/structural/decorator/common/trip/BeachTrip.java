package com.zewenaco.designpatterns.structural.decorator.common.trip;

public class BeachTrip implements ITrip {
  @Override
  public String getDetails() {
    return "Trip to Concon Beach";
  }

  @Override
  public double getPrice() {
    return 15000.0;
  }
}
