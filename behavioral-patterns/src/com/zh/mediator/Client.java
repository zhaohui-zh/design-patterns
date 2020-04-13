package com.zh.mediator;

/**
 * 客户类-中介者模式
 *
 * @author Zhaohui
 * @date 2020/4/13
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new President();
        Department development = new Development(mediator);
        Department finacial = new Finacial(mediator);

        development.selfAction();
        development.outAction();

        System.out.println("-----------------------");

        finacial.selfAction();
        finacial.outAction();
    }
}
