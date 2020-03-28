package com.zh.abstractfactory;

/**
 * 抽象工厂类
 * Created by zhaohui on 2020/3/27
 */
public interface AbstractFactory {
    /**
     * 创建手机
     * @return
     */
    Phone createPhone();

    /**
     * 创建平板
     * @return
     */
    Pad createPad();
}
