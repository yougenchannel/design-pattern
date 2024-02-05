package com.github.yougenchannel.design.facede;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午11:33
 */

public class Facade {

  private SubSystemA a;
  private SubSystemB b;

  public Facade(SubSystemA a, SubSystemB b) {
    this.a = a;
    this.b = b;
  }

  public void operator() {
    System.out.println("facade");
    a.operatorA();
    b.operatorB();
  }
}
