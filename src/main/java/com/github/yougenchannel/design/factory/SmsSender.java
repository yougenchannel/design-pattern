package com.github.yougenchannel.design.factory;

/**
 * @author: yougen.hu
 * @time: 2024/2/4 下午5:29
 */

public class SmsSender implements Sender {

  @Override
  public void send() {
    System.out.println("sms sender");
  }
}
