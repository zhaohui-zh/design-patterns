package com.zh.prototype;

/**
 * 原型模式-通过一个对象克隆出另一个对象
 *
 * @author Zhaohui
 * @date 2020/3/31
 */
public interface Prototype {
    Prototype myClone();
    void print();
}
