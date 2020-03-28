package com.zh.abstractfactory;

/**
 * 具体工厂类-小米工厂
 * Created by zhaohui on 2020/3/28
 */
public class XiaomiFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }

    @Override
    public Pad createPad() {
        return new XiaomiPad();
    }
}
