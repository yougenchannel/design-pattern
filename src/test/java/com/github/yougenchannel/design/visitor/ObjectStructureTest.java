package com.github.yougenchannel.design.visitor;

import org.junit.Test;

public class ObjectStructureTest {

  @Test
  public void tesVisitorPattern() {
    ObjectStructure objectStructure = new ObjectStructure();
    objectStructure.accept(new ConcreteVisitor());
  }

}