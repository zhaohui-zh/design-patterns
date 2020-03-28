package com.zh.abstractfactory;

/**
 * 具体产品-华为手机
 * Created by zhaohui on 2020/3/28
 */
public class HuaweiPhone implements Phone {
    @Override
    public void use() {
        System.out.println("Huawei Phone was used!");
    }
}
