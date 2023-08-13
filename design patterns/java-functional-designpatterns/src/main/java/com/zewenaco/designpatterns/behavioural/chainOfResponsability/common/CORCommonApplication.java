package com.zewenaco.designpatterns.behavioural.chainOfResponsability.common;

public class CORCommonApplication {

  public static void main(String[] args) {
    final Car car = new Car();
    final AbstractCarWashStep chain = new InitialWashStep();

    chain
        .andThen(new SoapStep())
        .andThen(new RinseStep())
        .andThen(new PolishStep())
        .andThen(new DryStep());

    final Car washedCar = chain.applyTo(car);

    System.out.println("Final car state is " + washedCar.washState());
  }
}
