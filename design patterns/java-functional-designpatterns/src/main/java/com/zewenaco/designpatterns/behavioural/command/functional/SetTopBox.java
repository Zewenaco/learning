package com.zewenaco.designpatterns.behavioural.command.functional;

public class SetTopBox implements IDevice {

  @Override
  public void on() {
    System.out.println("SetTopBox is on!");
  }

  @Override
  public void off() {
    System.out.println("SetTopBox is off!");
  }
}
