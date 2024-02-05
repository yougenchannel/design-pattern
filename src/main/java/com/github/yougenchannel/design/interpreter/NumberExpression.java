package com.github.yougenchannel.design.interpreter;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午4:45
 */

public class NumberExpression implements Expression {

  private int number;

  public NumberExpression(int number) {
    this.number = number;
  }

  @Override
  public int interpret() {
    return number;
  }
}
