package com.zewenaco.designpatterns.behavioural.template.common;

public enum VehicleType {
  CAR(Car::new),
  BUS(Bus::new);

  public final VehicleFactory<VehicleColor, IVehicle> factory;

  VehicleType(VehicleFactory<VehicleColor, IVehicle> factory) {
    this.factory = factory;
  }
}
