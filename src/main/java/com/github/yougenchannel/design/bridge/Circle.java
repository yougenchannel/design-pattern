package com.github.yougenchannel.design.bridge;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午10:28
 */

public class Circle extends Shape {

  private int x, y, r;

  public Circle(DrawAPI drawAPI, int x, int y, int r) {
    super(drawAPI);
    this.x = x;
    this.y = y;
    this.r = r;
  }

  @Override
  public void draw() {
    drawAPI.drawCircle(r, x, y);
  }
}
