package com.zh.iterator;

/**
 * 迭代器
 *
 * @author Zhaohui
 * @date 2020/4/9
 */
public interface Iterator<E> {
    boolean hasNext();
    E next();
}
