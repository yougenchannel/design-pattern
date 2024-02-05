package com.github.yougenchannel.design.factory;

import org.junit.Test;

public class SimpleSenderFactoryTest {

  @org.junit.Test
  public void produce() {
    SimpleSenderFactory simpleSenderFactory = new SimpleSenderFactory();
    Sender sender = simpleSenderFactory.produce("smsSender");
    sender.send();
  }

  @Test
  public void functionProduce() {
    FunctionSenderFactory functionSenderFactory = new FunctionSenderFactory();
    functionSenderFactory.produceEmailSender().send();

  }

  @Test
  public void staticFunctionProduce() {
    StaticFunctionSenderFactory.produceExpressSender().send();

  }
}