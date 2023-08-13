package com.zewenaco.designpatterns.behavioural.chainOfResponsability.common;

public class PolishStep extends AbstractCarWashStep {

  @Override
  Car applyTo(Car car) {
    final Car newCar = car.updateState(WashState.POLISHED);
    return this.nextStepExecute(newCar);
  }
}
