package com.zh.strategy;

/**
 * Context: 环境类
 *
 * @author Zhaohui
 * @date 2020/4/11
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.algorithm();
    }
}
