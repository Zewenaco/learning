package com.zewenaco.designpatterns.behavioural.chainOfResponsability.common;

public class SoapStep extends AbstractCarWashStep {

  @Override
  Car applyTo(Car car) {
    final Car newCar = car.updateState(WashState.SOAP);
    return this.nextStepExecute(newCar);
  }
}
