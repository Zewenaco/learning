package com.zewenaco.designpatterns.behavioural.chainOfResponsability.functional;

import com.zewenaco.designpatterns.behavioural.chainOfResponsability.common.WashState;
import java.util.Objects;
import java.util.function.Function;

public class Car implements Function<Car, Car> {
  private WashState washState;

  public Car() {
    this.washState = WashState.INITIAL;
    System.out.println("Car state transitioned to " + washState);
  }

  public Car updateState(WashState state) {
    System.out.println("Car state transitioned to " + state);
    this.washState = state;
    return this;
  }

  public WashState getWashState() {
    return this.washState;
  }

  @Override
  public Car apply(Car car) {
    if (Objects.nonNull(car)) {
      return car;
    }
    return this;
  }
}
