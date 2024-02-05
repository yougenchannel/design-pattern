package com.github.yougenchannel.design.factory;

/**
 * @author: yougen.hu
 * @time: 2024/2/4 下午5:19
 */

public class SimpleSenderFactory {

  public Sender produce(String senderName) {
    if (senderName == null) {
      return null;
    } else if ("smsSender".equals(senderName)) {
      return new SmsSender();
    } else if ("emailSender".equals(senderName)) {
      return new EmailSender();
    } else if ("expressSender".equals(senderName)) {
      return new ExpressSender();
    }

    return null;
  }
}
