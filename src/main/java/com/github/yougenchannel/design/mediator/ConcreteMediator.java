package com.github.yougenchannel.design.mediator;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午5:27
 */

public class ConcreteMediator implements Mediator {

  private Colleague colleague1;
  private Colleague colleague2;

  public void setColleague1(Colleague colleague1) {
    this.colleague1 = colleague1;
  }

  public void setColleague2(Colleague colleague2) {
    this.colleague2 = colleague2;
  }

  @Override
  public void sendMessage(String message, Colleague colleague) {
    if (colleague == colleague1) {

      colleague2.receiveMessage(message);
    } else {
      colleague1.receiveMessage(message);
    }
  }
}
