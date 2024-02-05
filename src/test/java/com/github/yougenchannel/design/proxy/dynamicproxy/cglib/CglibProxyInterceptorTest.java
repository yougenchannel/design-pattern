package com.github.yougenchannel.design.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

public class CglibProxyInterceptorTest {

  @Test
  public void testCglibInterceptor() {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(CaptainAmerica2MovieImpl.class);
    enhancer.setCallback(new CglibProxyInterceptor());
    CaptainAmerica2MovieImpl o = (CaptainAmerica2MovieImpl) enhancer.create();
    o.play();
  }

}