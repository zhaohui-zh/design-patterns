package com.zh.bridge;

/**
 * 客户类
 *
 * @author Zhaohui
 * @date 2020/4/2
 */
public class Client {

    public static void main(String[] args) {
        RefinedCoffee largeCoffeeWithSugar = new LargeCoffee(new Sugar());
        largeCoffeeWithSugar.orderCoffee(10);
        largeCoffeeWithSugar.checkQuality();
        RefinedCoffee mediumCoffeeWithMilk = new MediumCoffee(new Milk());
        mediumCoffeeWithMilk.orderCoffee(12);
        mediumCoffeeWithMilk.checkQuality();
    }

}
