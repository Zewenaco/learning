package com.zewenaco.designpatterns.behavioural.command.common;

public class OffCommand implements Command {

  private IDevice iDevice;

  public OffCommand(IDevice iDevice) {
    this.iDevice = iDevice;
  }

  @Override
  public void execute() {
    iDevice.off();
  }
}
