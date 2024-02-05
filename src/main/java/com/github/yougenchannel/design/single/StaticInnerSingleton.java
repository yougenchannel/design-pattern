package com.github.yougenchannel.design.single;

/**
 * @author: yougen.hu
 * @time: 2024/2/4 下午6:00
 */

public class StaticInnerSingleton {

  private StaticInnerSingleton() {}

  public StaticInnerSingleton getInstance() {
    return SingletonHolder.instance;
  }

  private static class SingletonHolder {

    private static final StaticInnerSingleton instance = new StaticInnerSingleton();
  }
}
