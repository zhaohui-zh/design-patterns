package com.zh.bridge;

/**
 * 加奶口味
 *
 * <p>具体实现化(ConcreteImplementor)角色
 *
 * @author Zhaohui
 * @date 2020/4/2
 */
public class Milk implements CoffeeAdditives {
    @Override
    public void addSomething() {
        System.out.println("加奶");
    }
}
