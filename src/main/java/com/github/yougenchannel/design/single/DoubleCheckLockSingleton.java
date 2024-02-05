package com.github.yougenchannel.design.single;

/**
 * 1. not using volatile keyword  can cause thread unsafe, because the jvm optimizes instruction rearrangement
 * volatile :
 *
 * @author: yougen.hu
 * @time: 2024/2/4 下午5:46
 */

public class DoubleCheckLockSingleton {

  private static volatile DoubleCheckLockSingleton instance;

  private DoubleCheckLockSingleton() {
  }

  public static DoubleCheckLockSingleton getInstance() {
    if (instance == null) {
      synchronized (DoubleCheckLockSingleton.class) {
        if (instance == null) {
          instance = new DoubleCheckLockSingleton();
        }
      }
    }
    return instance;
  }

}
