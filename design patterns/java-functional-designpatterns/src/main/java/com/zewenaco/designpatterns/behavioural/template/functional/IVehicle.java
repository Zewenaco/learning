package com.zewenaco.designpatterns.behavioural.template.functional;

import java.util.function.Consumer;

public interface IVehicle {

  default void start(Consumer<Void> preStarChecks) {
    System.out.printf("%n%s starting ...%n", this.getClass().getSimpleName());
    preStarChecks.accept(null);
  }

  void moveForward();

  void moveBackward();
}
