package com.zh.adapter;

/**
 * 类适配器
 *
 * <p>实现目标接口，继承适配者类
 *
 * @author Zhaohui
 * @date 2020/4/1
 */
public class AdapterClass extends Adaptee implements Target {
    @Override
    public void print() {
        myPrint();
    }
}
