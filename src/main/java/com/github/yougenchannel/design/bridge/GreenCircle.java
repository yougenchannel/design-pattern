package com.github.yougenchannel.design.bridge;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午10:26
 */

public class GreenCircle implements DrawAPI {

  @Override
  public void drawCircle(int r, int x, int y) {
    System.out.println("draw green circle");
  }
}
