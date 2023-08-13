package com.zewenaco.designpatterns.behavioural.template.common;

public class TemplateCommonApplication {

  public static void main(String[] args) {
    IVehicle bus = VehicleType.BUS.factory.apply(VehicleColor.WHITE);

    bus.start();
    bus.moveForward();
  }
}
