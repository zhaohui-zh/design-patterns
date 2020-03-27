package com.zh.factorymethod;

/**
 * 客户端类
 * Created by zhaohui on 2020/3/27
 */
public class Client {
    public static void main(String[] args) {
        Product productA = new ConcreteFactoryA().factoryMethod();
        Product productB = new ConcreteFactoryB().factoryMethod();
        productA.use();
        productB.use();
    }
}
