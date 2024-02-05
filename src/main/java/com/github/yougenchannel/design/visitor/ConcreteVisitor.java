package com.github.yougenchannel.design.visitor;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午7:07
 */

public class ConcreteVisitor implements Visitor {

  @Override
  public void visit(ConcreteElementB concreteElementB) {
    concreteElementB.operationB();
  }

  @Override
  public void visit(ConcreteElementA concreteElementA) {
    concreteElementA.operationA();
  }
}
