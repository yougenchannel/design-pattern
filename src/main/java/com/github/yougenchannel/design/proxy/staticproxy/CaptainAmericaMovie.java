package com.github.yougenchannel.design.proxy.staticproxy;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午3:02
 */

public class CaptainAmericaMovie implements Movie {

  @Override
  public void play() {
    System.out.println("playing captainAmerica");
  }
}
