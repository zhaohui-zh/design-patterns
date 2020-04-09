package com.zh.iterator;

/**
 * 具体聚合类
 *
 * @author Zhaohui
 * @date 2020/4/9
 */
public class ConcreteAggregate<E> implements Aggregate<E> {

    private E[] items;

    public ConcreteAggregate(E[] items) {
        this.items = items;
    }

    @Override
    public Iterator<E> createIterator() {
        return new ConcreteIterator<E>(items);
    }
}
