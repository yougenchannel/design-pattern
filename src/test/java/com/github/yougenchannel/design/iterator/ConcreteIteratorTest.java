package com.github.yougenchannel.design.iterator;

import org.junit.Test;

public class ConcreteIteratorTest {

  @Test
  public void testMyIterator() {
    String[] names = {"Alice", "Bob", "Charlie", "David"};
    Aggregate<String> aggregate = new ConcreteAggregate<>(names);

    // 获取迭代器并遍历
    Iterator<String> iterator = aggregate.createIterator();
    while (iterator.hasNext()) {
      String name = iterator.next();
      System.out.println("Name: " + name);
    }
  }

}