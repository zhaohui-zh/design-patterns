package com.zh.builder;

/**
 * MealBuilder-抽象建造者
 * Created by zhaohui on 2020/3/29
 */
public interface MealBuilder {

    void buildFood(String food);

    void buildDrink(String drink);

    Meal getMeal();
}
