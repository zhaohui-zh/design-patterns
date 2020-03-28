package com.zh.abstractfactory;

/**
 * 具体工厂类-华为工厂
 * Created by zhaohui on 2020/3/28
 */
public class HuaweiFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Pad createPad() {
        return new HuaweiPad();
    }
}
