package com.zh.bridge;

/**
 * 大杯咖啡
 *
 * @author Zhaohui
 * @date 2020/4/2
 */
public class LargeCoffee extends RefinedCoffee {

    public LargeCoffee(CoffeeAdditives additives) {
        super(additives);
    }

    @Override
    public void orderCoffee(int count) {
        additives.addSomething();
        System.out.println("大杯咖啡" + count + "杯");
    }
}
