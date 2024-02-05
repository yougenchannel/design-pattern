package com.github.yougenchannel.design.single;

/**
 * @author: yougen.hu
 * @time: 2024/2/4 下午5:41
 */

public class HungrySingleton {

  private static final HungrySingleton instance = new HungrySingleton();

  private HungrySingleton() {

  }


  public static HungrySingleton getInstance() {
    return instance;

  }

}
