package com.github.yougenchannel.design.factory;

/**
 * @author: yougen.hu
 * @time: 2024/2/4 下午5:38
 */

public class StaticFunctionSenderFactory {

  public static Sender produceSmsSender() {
    return new SmsSender();
  }

  public static Sender produceEmailSender() {
    return new EmailSender();
  }

  public static Sender produceExpressSender() {
    return new ExpressSender();
  }
}
