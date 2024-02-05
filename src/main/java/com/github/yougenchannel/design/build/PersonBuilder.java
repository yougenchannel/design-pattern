package com.github.yougenchannel.design.build;

/**
 * @author: yougen.hu
 * @time: 2024/2/4 下午7:10
 */

public class PersonBuilder implements IBuilder<Person> {

  private Person person = new Person();

  private String name;
  private int age;
  private int sex;

  public PersonBuilder() {}

  public PersonBuilder name(String name) {
    this.name = name;
    return this;
  }

  public PersonBuilder age(int age) {
    this.age = age;
    return this;
  }

  public PersonBuilder sex(int sex) {
    this.sex = sex;
    return this;
  }

  @Override
  public Person build() {
    String name = this.name;
    int age = this.age;
    int sex = this.sex;
    person.setName(name);
    person.setAge(age);
    person.setSex(sex);
    return person;
  }

}
