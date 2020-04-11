package com.zh.strategy;

/**
 * 客户类
 *
 * @author Zhaohui
 * @date 2020/4/11
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.algorithm();

        context.setStrategy(new ConcreteStrategyB());
        context.algorithm();
    }
}
