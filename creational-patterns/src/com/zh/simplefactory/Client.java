package com.zh.simplefactory;

/**
 * 客户端类
 * Created by zhaohui on 2020/3/26
 */
public class Client {

    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        Product productB = SimpleFactory.createProduct("B");
        productA.use();
        productB.use();
    }

}
