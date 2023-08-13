package com.zewenaco.designpatterns.behavioural.command.functional;

public class RemoteControlDevice {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void buttonPressed() {
    command.execute();
  }
}
