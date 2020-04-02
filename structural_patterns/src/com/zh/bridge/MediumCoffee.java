package com.zh.bridge;

/**
 * 中杯咖啡
 *
 * @author Zhaohui
 * @date 2020/4/2
 */
public class MediumCoffee extends RefinedCoffee {

    public MediumCoffee(CoffeeAdditives additives) {
        super(additives);
    }

    @Override
    public void orderCoffee(int count) {
        additives.addSomething();
        System.out.println("中杯咖啡" + count + "杯");
    }
}
