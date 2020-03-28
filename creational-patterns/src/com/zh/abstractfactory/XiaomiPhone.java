package com.zh.abstractfactory;

/**
 * 具体产品-小米手机
 * Created by zhaohui on 2020/3/28
 */
public class XiaomiPhone implements Phone{
    @Override
    public void use() {
        System.out.println("Xiaomi Phone was used!");
    }
}
