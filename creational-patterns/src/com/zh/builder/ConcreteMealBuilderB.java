package com.zh.builder;

/**
 * Created by zhaohui on 2020/3/29
 */
public class ConcreteMealBuilderB implements MealBuilder {

    private Meal meal;

    public ConcreteMealBuilderB() {
        meal = new Meal();
    }

    @Override
    public void buildFood(String food) {
        meal.setFood(food + "build by B");
    }

    @Override
    public void buildDrink(String drink) {
        meal.setDrink(drink + "build by B");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
