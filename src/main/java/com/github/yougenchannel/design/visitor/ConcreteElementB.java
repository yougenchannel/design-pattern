package com.github.yougenchannel.design.visitor;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午7:06
 */

public class ConcreteElementB implements Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void operationB() {
    System.out.println("operation B");
  }
}
