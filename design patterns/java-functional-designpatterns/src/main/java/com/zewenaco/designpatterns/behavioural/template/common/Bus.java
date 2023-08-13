package com.zewenaco.designpatterns.behavioural.template.common;

public class Bus extends AbstractVehicle {

  protected VehicleColor vehicleColor;

  public Bus(VehicleColor vehicleColor) {
    this.vehicleColor = vehicleColor;
  }

  @Override
  void preStartCheck() {
    System.out.println("Check if every new passenger has paid for their tickets");
    System.out.println("Check if every passenger is seated");
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
