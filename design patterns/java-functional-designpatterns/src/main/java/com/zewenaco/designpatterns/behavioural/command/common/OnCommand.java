package com.zewenaco.designpatterns.behavioural.command.common;

public class OnCommand implements Command {

  private IDevice iDevice;

  public OnCommand(IDevice iDevice) {
    this.iDevice = iDevice;
  }

  @Override
  public void execute() {
    iDevice.on();
  }
}
