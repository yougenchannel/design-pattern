package com.github.yougenchannel.design.proxy.staticproxy;

import org.junit.Test;

public class StaticProxyMovieTest {

  @Test
  public void testStaticProxyMovie() {
    StaticProxyMovie staticProxyMovie = new StaticProxyMovie(new CaptainAmericaMovie());
    staticProxyMovie.play();
  }

}