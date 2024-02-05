package com.github.yougenchannel.design.interpreter;

import org.junit.Test;

public class AdditionExpressionTest {

  @Test
  public void testInterpret() {
    Expression expression = new AdditionExpression(new AdditionExpression(new NumberExpression(1), new NumberExpression(2)), new NumberExpression(3));
    int interpret = expression.interpret();

    Context context = new Context("1 + 2 + 3");

    System.out.println(context.getInput() + "=" + interpret);
  }

}