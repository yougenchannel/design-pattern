package com.github.yougenchannel.design.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class MyInvocationHandlerTest {

  @Test
  public void testDynamicInvocationHandler() {

    System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
    MyInvocationHandler myInvocationHandler = new MyInvocationHandler(new IronManVIPMovie());
    VIPMovie o = (VIPMovie) Proxy.newProxyInstance(IronManVIPMovie.class.getClassLoader(), IronManVIPMovie.class.getInterfaces(),
        myInvocationHandler);
    o.vipPlay();
  }

}