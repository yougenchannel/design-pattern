package com.github.yougenchannel.design.visitor;

public interface Element {

  void accept(Visitor visitor);
}
