package com.zewenaco.designpatterns.behavioural.template.functional;

@FunctionalInterface
public interface VehicleFactory<VehicleColor, IVehicle> {
  public IVehicle apply(VehicleColor vehicleColor);
}
