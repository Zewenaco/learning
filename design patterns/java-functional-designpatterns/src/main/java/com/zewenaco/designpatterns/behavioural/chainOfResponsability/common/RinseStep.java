package com.zewenaco.designpatterns.behavioural.chainOfResponsability.common;

public class RinseStep extends AbstractCarWashStep {

  @Override
  Car applyTo(Car car) {
    final Car newCar = car.updateState(WashState.RINSED);
    return this.nextStepExecute(newCar);
  }
}
