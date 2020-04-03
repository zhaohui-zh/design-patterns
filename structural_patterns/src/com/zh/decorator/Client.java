package com.zh.decorator;

/**
 * 客户端
 *
 * @author Zhaohui
 * @date 2020/4/3
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecoratorA(component);
        System.out.println("装饰前");
        component.operation();
        System.out.println("装饰后");
        decorator.operation();
        System.out.println("调用添加的新功能");
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(component);
        decoratorB.anotherOperation();
        ConcreteDecoratorA decoratorA = (ConcreteDecoratorA) decorator;
        decoratorA.anotherOperation();
    }

}
