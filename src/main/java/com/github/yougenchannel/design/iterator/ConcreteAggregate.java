package com.github.yougenchannel.design.iterator;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午5:13
 */

public class ConcreteAggregate<T> implements Aggregate<T> {

  T[] items;

  public ConcreteAggregate(T[] items) {
    this.items = items;
  }

  @Override
  public Iterator<T> createIterator() {
    return new ConcreteIterator<T>(items);
  }
}
