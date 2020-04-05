package com.zh.flyweight;

/**
 * 客户类
 *
 * @author Zhaohui
 * @date 2020/4/5
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight = flyweightFactory.getFlyweight("First");
        flyweight.doOperation("First-Out");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("Second");
        flyweight2.doOperation("Second-Out");
        Flyweight flyweight3 = flyweightFactory.getFlyweight("First");
        flyweight3.doOperation("First-Out");
    }
}
