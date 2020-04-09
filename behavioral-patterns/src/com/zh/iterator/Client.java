package com.zh.iterator;

/**
 * 客户类
 *
 * @author Zhaohui
 * @date 2020/4/9
 */
public class Client {
    public static void main(String[] args) {
        String[] strings = {"Hello", "Hi", "halo", "Bye"};
        Aggregate<String> aggregate = new ConcreteAggregate<>(strings);
        Iterator<String > iterator = aggregate.createIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
