package com.github.yougenchannel.design.iterator;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午5:10
 */

public class ConcreteIterator<T> implements Iterator<T> {

  T[] items;
  int position;

  public ConcreteIterator(T[] items) {
    this.position = 0;
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    return position < items.length;
  }

  @Override
  public T next() {
    return items[position++];
  }
}
