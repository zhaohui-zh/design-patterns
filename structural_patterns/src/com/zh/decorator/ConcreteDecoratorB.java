package com.zh.decorator;

/**
 * 具体装饰器B
 *
 * @author Zhaohui
 * @date 2020/4/3
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void operationBefore() {
        System.out.println("ConcreteDecoratorB operation before");
    }

    private void operationAfter() {
        System.out.println("ConcreteDecoratorB operation after");
    }

    @Override
    public void operation() {
        operationBefore();
        super.operation();
        operationAfter();
    }

    // 新方法
    public void anotherOperation() {
        System.out.println("AnotherOperation In ConcreteDecoratorB");
    }

}
