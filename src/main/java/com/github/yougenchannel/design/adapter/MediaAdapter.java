package com.github.yougenchannel.design.adapter;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午10:17
 */

public class MediaAdapter implements MediaPlayer {

  private AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(String playType) {
    if ("vlc".equals(playType)) {
      advancedMediaPlayer = new VlcPlayer();
    }
  }

  @Override
  public void play(String mediaType, String fileName) {
    if ("vlc".equals(mediaType)) {
      advancedMediaPlayer.playVlc();
    }
  }

  @Override
  public void stop() {
    System.out.println("stop");

  }
}
