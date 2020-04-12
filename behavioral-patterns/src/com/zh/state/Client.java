package com.zh.state;

/**
 * 客户类
 *
 * @author Zhaohui
 * @date 2020/4/12
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.handleRequest();
        context.handleRequest();
        context.handleRequest();
        context.handleRequest();
        context.handleRequest();
        context.handleRequest();
        context.handleRequest();
        context.handleRequest();
        context.handleRequest();
    }
}
