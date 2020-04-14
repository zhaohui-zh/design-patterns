package com.zh.visitor;

/**
 * Bill
 *
 * <p>Element：元素接口或者抽象类，它定义了一个接受访问者的方法（Accept），
 * 其意义是指每一个元素都要可以被访问者访问。
 *
 * @author Zhaohui
 * @date 2020/4/14
 */
public interface Bill {
    void accept(AccountBookViewer v);
}
