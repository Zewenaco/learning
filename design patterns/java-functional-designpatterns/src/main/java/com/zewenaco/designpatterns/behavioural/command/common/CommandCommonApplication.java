package com.zewenaco.designpatterns.behavioural.command.common;

public class CommandCommonApplication {

  public static void main(String[] args) {

    RemoteControlDevice remoteControlDevice = new RemoteControlDevice();

    remoteControlDevice.tvOnButton().pressButton();

    remoteControlDevice.tvOffButton().pressButton();

    remoteControlDevice.setTopBoxOnButton().pressButton();

    remoteControlDevice.setTopBoxOffButton().pressButton();
  }
}
