package com.zh.factorymethod;

/**
 * 抽象工厂类-负责定义创建产品对象的公共接口
 * Created by zhaohui on 2020/3/27
 */
public abstract class Factory {

    public abstract Product factoryMethod();

    public void doSomething() {
        System.out.println("Something has done!");
    }

}
