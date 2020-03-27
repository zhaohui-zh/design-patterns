package com.zh.factorymethod;

/**
 * 具体工厂类B-生产具体产品A
 * Created by zhaohui on 2020/3/27
 */
public class ConcreteFactoryB extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
