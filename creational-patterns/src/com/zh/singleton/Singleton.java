package com.zh.singleton;

/**
 * 单例模式-一个类只有一个实例
 *
 * @author Zhaohui
 * @date 2020/3/30
 */
public class Singleton {

    private static Singleton singleton;

    private String name;

    private Singleton(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton("MySingleton");
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.print();
        Singleton singleton2 = Singleton.getInstance();
        singleton2.print();

    }
}
