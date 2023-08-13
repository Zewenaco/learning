package com.zewenaco.designpatterns.behavioural.template.functional;

public class Bus implements IVehicle {

  protected VehicleColor vehicleColor;

  public Bus(VehicleColor vehicleColor) {
    this.vehicleColor = vehicleColor;
  }

  @Override
  public void moveForward() {
    System.out.printf(
        "%s %s moves forwards%n", this.getClass().getSimpleName(), this.vehicleColor.name());
  }

  @Override
  public void moveBackward() {
    System.out.printf(
        "%s %s moves backwards%n", this.getClass().getSimpleName(), this.vehicleColor.name());
  }
}
