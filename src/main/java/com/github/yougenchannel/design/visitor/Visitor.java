package com.github.yougenchannel.design.visitor;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午7:05
 */

public interface Visitor {

  void visit(ConcreteElementB concreteElementB);

  void visit(ConcreteElementA concreteElementA);
}
