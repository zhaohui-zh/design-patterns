package com.zh.composite;

/**
 * 组合模式-客户类
 *
 * <p>组合系统最常见的例子-文件系统
 * Component可以看作是对文件和目录的抽象，即他们共同的父类，
 * Leaf可以看作是一个文件，Composite可以看作是一个目录，目录里面可以有文件或目录，
 * 即Composite里有一个Component列表。
 *
 * @author Zhaohui
 * @date 2020/4/6
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        Component node1 = new Leaf("1");
        Component node2 = new Composite("2");
        Component node3 = new Leaf("3");
        root.add(node1);
        root.add(node2);
        root.add(node3);
        Component node21 = new Leaf("21");
        Component node22 = new Composite("22");
        node2.add(node21);
        node2.add(node22);
        Component node221 = new Leaf("221");
        node22.add(node221);
        root.print();
    }
}
