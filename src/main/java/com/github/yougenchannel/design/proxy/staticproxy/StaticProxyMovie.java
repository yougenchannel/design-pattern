package com.github.yougenchannel.design.proxy.staticproxy;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 下午3:03
 */

public class StaticProxyMovie implements Movie {

  private Movie movie;

  public StaticProxyMovie(Movie movie) {
    this.movie = movie;
  }

  @Override
  public void play() {
    before();
    movie.play();
    after();
  }

  private void before() {
    System.out.println("before....");
  }

  private void after() {
    System.out.println("after");

  }
}
