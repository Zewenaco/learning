package com.zewenaco.designpatterns.behavioural.template.functional;

public enum VehicleType {
  CAR(Car::new),
  BUS(Bus::new);

  public final VehicleFactory<VehicleColor, IVehicle> factory;

  VehicleType(VehicleFactory<VehicleColor, IVehicle> factory) {
    this.factory = factory;
  }
}
