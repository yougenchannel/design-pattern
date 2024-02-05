package com.github.yougenchannel.design.mediator;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午5:23
 */

public interface Colleague {

  void sendMessage(String message);

  void receiveMessage(String message);

}
