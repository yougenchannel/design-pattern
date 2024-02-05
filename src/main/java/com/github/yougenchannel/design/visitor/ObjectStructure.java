package com.github.yougenchannel.design.visitor;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午7:11
 */

public class ObjectStructure {

  private Element[] elements;

  public ObjectStructure() {
    elements = new Element[]{new ConcreteElementA(), new ConcreteElementB()};
  }

  public void accept(Visitor visitor) {
    for (Element e : elements) {
      e.accept(visitor);
    }

  }
}
