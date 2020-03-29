package com.zh.builder;

/**
 * Created by zhaohui on 2020/3/29
 */
public class KFCWaiter {

    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        mealBuilder.buildDrink("Cola");
        mealBuilder.buildFood("Chips");
        return mealBuilder.getMeal();
    }
}
