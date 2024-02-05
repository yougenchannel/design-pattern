package com.github.yougenchannel.design.prototype;

import org.junit.Test;

public class SheepTest {

  @Test
  public void testPrototype() throws CloneNotSupportedException {
    Sheep sheep = new Sheep();
    sheep.setAge(1);
    Sheep newSheep = sheep.clone();
    System.out.println(newSheep.getAge());
  }

}