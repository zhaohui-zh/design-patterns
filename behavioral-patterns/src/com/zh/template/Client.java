package com.zh.template;

/**
 * 模板方法模式客户类
 *
 * <P>定义算法框架，并将一些步骤的实现延迟到子类。
 * 通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构。
 *
 * @author Zhaohui
 * @date 2020/4/12
 */
public class Client {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("----------------");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

    }
}
