package com.zewenaco.designpatterns.behavioural.chainOfResponsability.common;

public class DryStep extends AbstractCarWashStep {

  @Override
  Car applyTo(Car car) {
    final Car newCar = car.updateState(WashState.DRIED);
    return this.nextStepExecute(newCar);
  }
}
