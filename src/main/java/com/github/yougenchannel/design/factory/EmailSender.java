package com.github.yougenchannel.design.factory;

/**
 * @author: yougen.hu
 * @time: 2024/2/4 下午5:27
 */

public class EmailSender implements Sender {

  @Override
  public void send() {
    System.out.println("send email");
  }
}
