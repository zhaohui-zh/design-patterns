package com.zh.factorymethod;

/**
 * 具体产品A
 * Created by zhaohui on 2020/3/26
 */
public class ConcreteProductA implements Product {

    @Override
    public void use() {
        System.out.println("Concrete Product A was used!");
    }
}
