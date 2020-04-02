package com.zh.bridge;

/**
 * Coffee类
 *
 * <p>抽象化(Abstraction)角色-咖啡容量
 *
 * @author Zhaohui
 * @date 2020/4/2
 */
public abstract class Coffee {

    protected CoffeeAdditives additives;

    public Coffee(CoffeeAdditives additives) {
        this.additives = additives;
    }

    public abstract void orderCoffee(int count);
}
