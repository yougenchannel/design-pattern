package com.github.yougenchannel.design.filter;

import java.util.List;

/**
 * @author: yougen.hu
 * @time: 2024/2/5 上午11:04
 */

public interface IFilter<T> {

  List<T> filter(List<T> list);
}
