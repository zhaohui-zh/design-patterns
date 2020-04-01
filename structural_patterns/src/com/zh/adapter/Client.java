package com.zh.adapter;

/**
 * 客户端类
 *
 * @author Zhaohui
 * @date 2020/4/1
 */
public class Client {

    public static void main(String[] args) {
        // 使用类适配器
        AdapterClass adapterClass = new AdapterClass();
        adapterClass.print();
        // 使用对象适配器
        AdapterObject adapterObject = new AdapterObject(new Adaptee());
        adapterObject.print();
    }

}
