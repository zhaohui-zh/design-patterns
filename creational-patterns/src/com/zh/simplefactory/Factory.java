package com.zh.simplefactory;

/**
 * 工厂类 负责产品的创建
 * Created by zhaohui on 2020/3/26
 */
public class Factory {

    public static final Product createProduct(String type) {
        if (type.equals("A"))
            return new ConcreteProductA();
        if (type.equals("B"))
            return new ConcreteProductB();
        return null;
    }

}
