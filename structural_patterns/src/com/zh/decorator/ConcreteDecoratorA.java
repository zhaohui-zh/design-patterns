package com.zh.decorator;

/**
 * 具体装饰器A
 *
 * @author Zhaohui
 * @date 2020/4/3
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void operationBefore() {
        System.out.println("ConcreteDecoratorA operation before");
    }

    private void operationAfter() {
        System.out.println("ConcreteDecoratorA operation before");
    }

    @Override
    public void operation() {
        operationBefore();
        super.operation();
        operationAfter();
    }

    // 新方法
    public void anotherOperation() {
        System.out.println("AnotherOperation In ConcreteDecoratorA");
    }
}
