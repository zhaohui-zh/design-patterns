package com.zh.builder;

/**
 * 客户端
 * 建造者模式的核心思想是
 * 1）一步一步地创建复杂对象；
 * 2）将复杂对象地表示与构建分离。
 * Created by zhaohui on 2020/3/29
 */
public class Client {
    public static void main(String[] args) {
        KFCWaiter kfcWaiter = new KFCWaiter();
        kfcWaiter.setMealBuilder(new ConcreteMealBuilderB());
        Meal meal = kfcWaiter.construct();
        System.out.println(meal.getDrink());
        System.out.println(meal.getFood());
    }
}
