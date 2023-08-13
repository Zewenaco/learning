package com.zewenaco.designpatterns.structural.decorator.common.trip;

public class MountainTrip implements ITrip {

  @Override
  public String getDetails() {
    return "Trip to Cajon del Maipo";
  }

  @Override
  public double getPrice() {
    return 30000.0;
  }
}
