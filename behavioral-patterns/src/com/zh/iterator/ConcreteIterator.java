package com.zh.iterator;

/**
 * 具体迭代器
 *
 * @author Zhaohui
 * @date 2020/4/9
 */
public class ConcreteIterator<E> implements Iterator<E> {

    private E[] items;
    private int position = 0;

    public ConcreteIterator(E[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public E next() {
        return items[position++];
    }
}
