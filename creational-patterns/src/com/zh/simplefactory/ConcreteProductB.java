package com.zh.simplefactory;

/**
 * 具体产品B
 * Created by zhaohui on 2020/3/26
 */
public class ConcreteProductB implements Product {

    @Override
    public void use() {
        System.out.println("Concrete Product B was used!");
    }

}
