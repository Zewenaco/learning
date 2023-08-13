package com.zewenaco.designpatterns.behavioural.template.common;

public class Car extends AbstractVehicle {

  protected VehicleColor vehicleColor;

  public Car(VehicleColor vehicleColor) {
    this.vehicleColor = vehicleColor;
  }

  @Override
  void preStartCheck() {
    System.out.println("Check passive security components");
    System.out.println("Check mirrors");
    System.out.println("Push break");
    System.out.println("Start engine");
    System.out.println("Release hand break");
    System.out.println("Move gear lever");
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
