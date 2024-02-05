package com.github.yougenchannel.design.mediator;

public interface Mediator {

  void sendMessage(String message, Colleague colleague);
}
