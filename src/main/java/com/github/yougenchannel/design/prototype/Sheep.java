package com.github.yougenchannel.design.prototype;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午10:06
 */

public class Sheep implements Cloneable {

  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  protected Sheep clone() throws CloneNotSupportedException {
    return (Sheep) super.clone();
  }
}
