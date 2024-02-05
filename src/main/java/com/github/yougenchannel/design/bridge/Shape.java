package com.github.yougenchannel.design.bridge;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午10:27
 */

public abstract class Shape {

  protected DrawAPI drawAPI;

  public Shape(DrawAPI drawAPI) {
    this.drawAPI = drawAPI;
  }

  public abstract void draw();
}
