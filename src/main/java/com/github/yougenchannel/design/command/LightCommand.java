package com.github.yougenchannel.design.command;

/**
 * Concrete Command
 *
 * @author: yougen.hu
 * @time: 2024/2/5 下午4:19
 */

public class LightCommand implements Command {

  private Light light;

  public void setLight(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    System.out.println("log...");
    light.tureOn();
  }
}
