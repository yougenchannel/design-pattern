package com.github.yougenchannel.design.command;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午4:39
 */

public class CommandPatternExample {

  public static void main(String[] args) {
    Light light = new Light();
    LightCommand lightCommand = new LightCommand();
    lightCommand.setLight(light);
    RemoteControl remoteControl = new RemoteControl(lightCommand);
    remoteControl.pressButton();
  }
}
