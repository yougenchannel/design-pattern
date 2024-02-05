package com.github.yougenchannel.design.template;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午6:14
 */

public abstract class AbstractClass {

  public void templateMethod() {

  }

  private void stepOne() {
    System.out.println("performed step one");
  }

  protected abstract void stepTow();
}
