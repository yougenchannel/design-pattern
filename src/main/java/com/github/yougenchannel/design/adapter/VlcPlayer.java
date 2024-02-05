package com.github.yougenchannel.design.adapter;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午10:16
 */

public class VlcPlayer implements AdvancedMediaPlayer {

  @Override
  public void playMp4() {

  }

  @Override
  public void playVlc() {
    System.out.println("play vlc");
  }
}
