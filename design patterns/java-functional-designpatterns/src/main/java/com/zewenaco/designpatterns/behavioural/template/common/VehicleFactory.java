package com.zewenaco.designpatterns.behavioural.template.common;

@FunctionalInterface
public interface VehicleFactory<VehicleColor, IVehicle> {
  public IVehicle apply(VehicleColor vehicleColor);
}
