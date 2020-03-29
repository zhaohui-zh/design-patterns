package com.zh.builder;

/**
 * 具体建造者A
 * Created by zhaohui on 2020/3/29
 */
public class ConcreteMealBuilderA implements MealBuilder {

    private Meal meal;

    public ConcreteMealBuilderA() {
        meal = new Meal();
    }

    @Override
    public void buildFood(String food) {
        meal.setFood(food + " build by A");
    }

    @Override
    public void buildDrink(String drink) {
        meal.setDrink(drink + " build by A");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
