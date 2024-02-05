package com.github.yougenchannel.design.visitor;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午7:05
 */

public class ConcreteElementA implements Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void operationA() {
    System.out.println("operation A");
  }
}
