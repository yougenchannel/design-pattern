package com.github.yougenchannel.design.command;

/**
 * Invoker
 *
 * @author: yougen.hu
 * @time: 2024/2/5 下午4:33
 */

public class RemoteControl {

  private Command command;

  public RemoteControl(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
  }
}
