package com.zewenaco.designpatterns.behavioural.template.functional;

public class Car implements IVehicle {

  protected VehicleColor vehicleColor;

  public Car(VehicleColor vehicleColor) {
    this.vehicleColor = vehicleColor;
  }

  @Override
  public void moveForward() {
    System.out.printf(
        "%s %s moves forwards", this.getClass().getSimpleName(), this.vehicleColor.name());
  }

  @Override
  public void moveBackward() {
    System.out.printf(
        "%s %s moves backwards", this.getClass().getSimpleName(), this.vehicleColor.name());
  }
}
