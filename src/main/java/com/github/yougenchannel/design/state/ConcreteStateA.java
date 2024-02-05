package com.github.yougenchannel.design.state;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午6:03
 */

public class ConcreteStateA implements State {

  @Override
  public void handle() {
    System.out.println("A");
  }
}
