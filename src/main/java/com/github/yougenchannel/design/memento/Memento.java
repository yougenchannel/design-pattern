package com.github.yougenchannel.design.memento;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午5:48
 */

public class Memento {

  private String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
