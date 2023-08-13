package com.zewenaco.designpatterns.behavioural.command.functional;

public class TV implements IDevice {

  @Override
  public void on() {
    System.out.println("TV is on!");
  }

  @Override
  public void off() {
    System.out.println("TV is off!");
  }
}
