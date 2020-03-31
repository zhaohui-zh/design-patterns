package com.zh.prototype;

/**
 * 具体原型
 *
 * @author Zhaohui
 * @date 2020/3/31
 */
public class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype myClone() {
        return new ConcretePrototype(name);
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
