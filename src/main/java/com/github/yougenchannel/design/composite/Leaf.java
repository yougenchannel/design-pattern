package com.github.yougenchannel.design.composite;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午11:14
 */

public class Leaf implements Component {

  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Leaf(String name) {
    this.name = name;
  }

  @Override
  public void operation() {
    System.out.println(name);
  }
}
