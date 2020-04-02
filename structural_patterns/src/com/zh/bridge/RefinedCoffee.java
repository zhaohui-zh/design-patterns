package com.zh.bridge;

/**
 * 扩充的Coffee类
 *
 * <p>修正抽象化(RefinedAbstraction)角色：扩展抽象化角色，改变和修正父类对抽象化的定义.
 *
 * @author Zhaohui
 * @date 2020/4/2
 */
public abstract class RefinedCoffee extends Coffee {

    public RefinedCoffee(CoffeeAdditives additives) {
        super(additives);
    }

    public void checkQuality() {
        System.out.println("质检合格");
    }

    public abstract void orderCoffee(int count);
}
