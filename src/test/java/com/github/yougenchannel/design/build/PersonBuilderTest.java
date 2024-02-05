package com.github.yougenchannel.design.build;

import org.junit.Test;

public class PersonBuilderTest {


  @Test
  public void testPersonBuild() {
    PersonBuilder builder = new PersonBuilder();
    Person martin = builder.age(1).sex(1).name("martin").build();
    System.out.println(martin);
  }

}