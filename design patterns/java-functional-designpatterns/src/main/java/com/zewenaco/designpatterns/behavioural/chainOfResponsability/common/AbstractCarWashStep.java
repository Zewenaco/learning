package com.zewenaco.designpatterns.behavioural.chainOfResponsability.common;

import java.util.Objects;

public abstract class AbstractCarWashStep {

  protected AbstractCarWashStep nextStep;

  public AbstractCarWashStep andThen(AbstractCarWashStep nextStep) {
    this.nextStep = nextStep;
    return nextStep;
  }

  abstract Car applyTo(Car car);

  public Car nextStepExecute(Car newCar) {
    if (Objects.nonNull(nextStep)) {
      return nextStep.applyTo(newCar);
    }
    return newCar;
  }
}
