package com.github.yougenchannel.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午11:38
 */

public class ShapeFactory {

  private static final Map<String, Shape> circleMap = new HashMap<>();

  public static Shape getCircle(String color) {
    Shape shape = circleMap.getOrDefault(color, new Circle(color));
    return shape;
  }


}
