package com.zewenaco.designpatterns.behavioural.template.common;

public abstract class AbstractVehicle implements IVehicle {

  public void start() {
    preStartCheck();
    System.out.printf("%s starting ...%n", this.getClass().getSimpleName());
  }

  abstract void preStartCheck();
}
