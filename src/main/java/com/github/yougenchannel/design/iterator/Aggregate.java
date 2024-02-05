package com.github.yougenchannel.design.iterator;

public interface Aggregate<T> {

  Iterator<T> createIterator();
}
