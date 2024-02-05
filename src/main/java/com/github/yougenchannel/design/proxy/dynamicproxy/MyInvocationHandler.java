package com.github.yougenchannel.design.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午3:08
 */

public class MyInvocationHandler implements InvocationHandler {

  private Object object;

  public MyInvocationHandler(Object object) {
    this.object = object;
  }

  @Override
  public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
    before();
    method.invoke(object, objects);
    after();
    return null;
  }

  private void before() {
    System.out.println("before....");
  }

  private void after() {
    System.out.println("after");

  }
}
