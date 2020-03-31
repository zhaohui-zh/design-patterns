package com.zh.prototype;

/**
 * 客户端类
 *
 * @author Zhaohui
 * @date 2020/3/31
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("Zhaohui");
        prototype.print();
        Prototype prototype2 = prototype.myClone();
        prototype2.print();
    }
}
