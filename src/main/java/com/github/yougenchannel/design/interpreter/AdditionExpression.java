package com.github.yougenchannel.design.interpreter;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午4:46
 */

public class AdditionExpression implements Expression {

  private Expression left;
  private Expression right;

  public AdditionExpression(Expression left, Expression right) {
    this.left = left;
    this.right = right;

  }

  @Override
  public int interpret() {
    return left.interpret() + right.interpret();
  }
}
