package com.github.yougenchannel.design.state;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午6:04
 */

public class Context {

  private State state;

  public void setState(State state) {
    this.state = state;
  }

  public void request() {
    state.handle();
  }
}
