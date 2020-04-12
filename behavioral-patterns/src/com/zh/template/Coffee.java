package com.zh.template;

/**
 * Coffee
 *
 * @author Zhaohui
 * @date 2020/4/12
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }
}
