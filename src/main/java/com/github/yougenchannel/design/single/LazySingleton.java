package com.github.yougenchannel.design.single;

/**
 * @author: yougen.hu
 * @time: 2024/2/4 下午5:44
 */

public class LazySingleton {

  private static LazySingleton instance;

  private LazySingleton() {}

  public static synchronized LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }

}
