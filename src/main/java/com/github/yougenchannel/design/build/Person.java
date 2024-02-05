package com.github.yougenchannel.design.build;

/**
 * @author: yougen.hu
 * @time: 2024/2/4 下午7:07
 */

public class Person {

  private String name;
  private int age;
  private int sex;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  public int getSex() {
    return sex;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", sex=" + sex +
        '}';
  }
}
