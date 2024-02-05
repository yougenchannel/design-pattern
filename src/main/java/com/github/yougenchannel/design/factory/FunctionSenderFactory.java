package com.github.yougenchannel.design.factory;

/**
 * @author: yougen.hu
 * @time: 2024/2/4 下午5:35
 */

public class FunctionSenderFactory {

  public Sender produceSmsSender() {
    return new SmsSender();
  }

  public Sender produceEmailSender() {
    return new EmailSender();
  }

  public Sender produceExpressSender() {
    return new ExpressSender();
  }
}
