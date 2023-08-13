package com.zewenaco.designpatterns.behavioural.command.common;

public class RemoteControlDevice {

  private RemoteButton tvOnButton;

  private RemoteButton tvOffButton;

  private RemoteButton setTopBoxOnButton;

  private RemoteButton setTopBoxOffButton;

  public RemoteControlDevice() {
    tvOnButton = new RemoteButton(() -> new TV().on());
    tvOnButton = new RemoteButton(new OnCommand(new TV()));
    tvOffButton = new RemoteButton(new OffCommand(new TV()));
    setTopBoxOnButton = new RemoteButton(new OnCommand(new SetTopBox()));
    setTopBoxOffButton = new RemoteButton(new OffCommand(new SetTopBox()));
  }

  //As remote can have multiple buttons you can have multiple such commands

  public RemoteButton tvOnButton() {
    return tvOnButton;
  }

  public RemoteButton tvOffButton() {
    return tvOffButton;
  }

  public RemoteButton setTopBoxOnButton() {
    return setTopBoxOnButton;
  }

  public RemoteButton setTopBoxOffButton() {
    return setTopBoxOffButton;
  }
}
