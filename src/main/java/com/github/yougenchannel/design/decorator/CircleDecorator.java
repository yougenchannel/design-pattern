package com.github.yougenchannel.design.decorator;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午11:25
 */

public class CircleDecorator implements Shape {

  protected Shape decorateShape;

  public CircleDecorator(Shape decorateShape) {
    this.decorateShape = decorateShape;
  }

  @Override
  public void draw() {
    decorateShape.draw();
  }
}
