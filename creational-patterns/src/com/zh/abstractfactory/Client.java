package com.zh.abstractfactory;

/**
 * 客户端类
 * Created by zhaohui on 2020/3/28
 */
public class Client {
    public static void main(String[] args) {
        // Xiaomi
        AbstractFactory factory = new XiaomiFactory();
        Phone phone = factory.createPhone();
        Pad pad = factory.createPad();
        phone.use();
        pad.use();

        // Huawei
        factory = new HuaweiFactory();
        phone = factory.createPhone();
        pad = factory.createPad();
        phone.use();
        pad.use();
    }

}
