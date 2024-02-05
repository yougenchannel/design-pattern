package com.github.yougenchannel.design.filter;

import java.util.List;
import java.util.stream.Collectors;

import com.github.yougenchannel.design.build.Person;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午11:05
 */

public class MalePersonFilter implements IFilter<Person> {

  @Override
  public List<Person> filter(List<Person> list) {
    return list.stream().filter(e -> 1 == e.getSex()).collect(Collectors.toList());
  }
}
