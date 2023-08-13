package com.zewenaco.designpatterns.behavioural.chainOfResponsability.common;

public class InitialWashStep extends AbstractCarWashStep {

  @Override
  Car applyTo(Car car) {
    final Car newCar = car.updateState(WashState.INITIAL_WASH);
    return this.nextStepExecute(newCar);
  }
}
