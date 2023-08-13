package com.zewenaco.designpatterns.behavioural.command.common;

public class RemoteButton implements IButton {

  private Command command;

  public RemoteButton(Command command) {
    this.command = command;
  }

  @Override
  public void pressButton() {
    command.execute();
  }
}
