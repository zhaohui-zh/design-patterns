package com.zh.strategy;

/**
 * ConcreteStrategy: 具体策略类
 *
 * @author Zhaohui
 * @date 2020/4/11
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("Use algorithm B");
    }
}
