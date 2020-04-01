package com.zh.adapter;

/**
 * 对象适配器类
 *
 * <p>实现目标接口，类内部有一个适配者类对象
 *
 * @author Zhaohui
 * @date 2020/4/1
 */
public class AdapterObject implements Target {

    private Adaptee adaptee;

    public AdapterObject(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void print() {
        adaptee.myPrint();
    }
}
