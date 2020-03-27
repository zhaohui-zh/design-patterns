package com.zh.factorymethod;

/**
 * 具体工厂类A-生成具体产品B
 * Created by zhaohui on 2020/3/27
 */
public class ConcreteFactoryA extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
