package com.github.yougenchannel.design.decorator;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午11:26
 */

public class RedCircleDecorator extends CircleDecorator {

  @Override
  public void draw() {
    super.draw();

    System.out.println("set Red color");
  }

  public RedCircleDecorator(Shape decorateShape) {
    super(decorateShape);
  }
}
