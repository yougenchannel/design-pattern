package com.github.yougenchannel.design.mediator;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午5:25
 */

public class ConcreteColleague implements Colleague {

  private Mediator mediator;

  public ConcreteColleague(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void sendMessage(String message) {
    mediator.sendMessage(message, this);
  }

  @Override
  public void receiveMessage(String message) {
    System.out.println("receive message : " + message);
  }
}
