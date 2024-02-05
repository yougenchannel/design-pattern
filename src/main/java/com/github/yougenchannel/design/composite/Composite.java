package com.github.yougenchannel.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午11:15
 */

public class Composite implements Component {


  List<Component> children = new ArrayList<>();

  public void add(Component component) {
    children.add(component);
  }

  public boolean remove(Component component) {
    return children.remove(component);
  }

  @Override
  public void operation() {
    children.forEach(Component::operation);
  }
}
