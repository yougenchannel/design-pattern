package com.github.yougenchannel.design.proxy.dynamicproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午3:52
 */

public class CglibProxyInterceptor implements MethodInterceptor {

  @Override
  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
    before();
    methodProxy.invokeSuper(o, objects);
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
