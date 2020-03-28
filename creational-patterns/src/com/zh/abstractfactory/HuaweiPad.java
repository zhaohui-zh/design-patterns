package com.zh.abstractfactory;

/**
 * 具体产品-华为平板
 * Created by zhaohui on 2020/3/28
 */
public class HuaweiPad implements Pad {
    @Override
    public void use() {
        System.out.println("Huawei Pad was used!");
    }
}
