package com.zewenaco.designpatterns.behavioural.template.functional;

public class TemplateFunctionalApplication {

  public static void main(String[] args) {
    IVehicle bus = VehicleType.BUS.factory.apply(VehicleColor.WHITE);

    bus.start(
        nil -> {
          System.out.println("Check if every new passenger has paid for their tickets");
          System.out.println("Check if every passenger is seated");
        });
    bus.moveForward();

    IVehicle car = VehicleType.CAR.factory.apply(VehicleColor.BLACK);

    car.start(
        nil -> {
          System.out.println("Check passive security components");
          System.out.println("Check mirrors");
          System.out.println("Push break");
          System.out.println("Start engine");
          System.out.println("Release hand break");
          System.out.println("Move gear lever");
        });
    car.moveBackward();
  }
}
