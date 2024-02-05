package com.github.yougenchannel.design.flyweight;


/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午11:36
 */

public class Circle implements Shape {

  private String color;

  public Circle(String color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println("circle");
  }
}
