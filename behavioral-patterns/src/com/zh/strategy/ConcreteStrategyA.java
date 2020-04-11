package com.zh.strategy;

/**
 * ConcreteStrategy: 具体策略类
 *
 * @author Zhaohui
 * @date 2020/4/11
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("Use algorithm A");
    }
}
