package com.github.yougenchannel.design.mediator;

import org.junit.Test;

public class ConcreteColleagueTest {

  @Test
  public void testMediator() {
    ConcreteMediator mediator = new ConcreteMediator();
    ConcreteColleague concreteColleague1 = new ConcreteColleague(mediator);
    ConcreteColleague concreteColleague2 = new ConcreteColleague(mediator);
    mediator.setColleague1(concreteColleague1);
    mediator.setColleague2(concreteColleague2);
    mediator.sendMessage("hello , im colleague1", concreteColleague1);
  }

}