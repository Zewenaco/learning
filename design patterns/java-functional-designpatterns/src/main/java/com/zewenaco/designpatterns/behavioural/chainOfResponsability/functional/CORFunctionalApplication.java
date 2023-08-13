package com.zewenaco.designpatterns.behavioural.chainOfResponsability.functional;

import com.zewenaco.designpatterns.behavioural.chainOfResponsability.common.WashState;

public class CORFunctionalApplication {
  public static void main(String[] args) {
    Car dirtyCar = new Car();
    final Car washedCar =
            dirtyCar
                    .andThen(car1 -> car1.updateState(WashState.INITIAL_WASH))
                    .andThen(car1 -> car1.updateState(WashState.SOAP))
                    .andThen(car1 -> car1.updateState(WashState.RINSED))
                    .andThen(car1 -> car1.updateState(WashState.POLISHED))
                    .andThen(car1 -> car1.updateState(WashState.DRIED))
                    .apply(dirtyCar);
    System.out.println("Final car state is " + washedCar.getWashState());
  }
}
