package com.zh.composite;

/**
 * 抽象构建角色
 *
 * @author Zhaohui
 * @date 2020/4/6
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void print() {
        print(0);
    }

    abstract void print(int level);

    abstract public void add(Component component);

    abstract public void remove(Component component);
}
