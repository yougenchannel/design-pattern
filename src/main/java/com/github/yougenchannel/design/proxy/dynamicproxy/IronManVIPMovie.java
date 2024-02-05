package com.github.yougenchannel.design.proxy.dynamicproxy;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午3:07
 */

public class IronManVIPMovie implements VIPMovie {

  @Override
  public void vipPlay() {
    System.out.println("playing ironMan");
  }
}
