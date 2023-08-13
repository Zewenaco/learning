package com.zewenaco.designpatterns.behavioural.command.functional;

public class CommandFunctionalApplication {

  public static void main(String[] args) {
    RemoteControlDevice remoteControlDevice = new RemoteControlDevice();

    remoteControlDevice.setCommand(() -> new TV().on());
    remoteControlDevice.buttonPressed();
  }
}
