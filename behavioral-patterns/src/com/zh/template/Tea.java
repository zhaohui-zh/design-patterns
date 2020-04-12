package com.zh.template;

/**
 * Tea
 *
 * @author Zhaohui
 * @date 2020/4/12
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
