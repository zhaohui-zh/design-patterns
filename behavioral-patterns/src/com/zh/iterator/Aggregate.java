package com.zh.iterator;

/**
 * 聚合类
 *
 * @author Zhaohui
 * @date 2020/4/9
 */
public interface Aggregate<E> {
    Iterator<E> createIterator();
}
