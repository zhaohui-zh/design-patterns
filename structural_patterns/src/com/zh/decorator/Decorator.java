package com.zh.decorator;

/**
 * 抽象装饰器
 *
 * @author Zhaohui
 * @date 2020/4/3
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
