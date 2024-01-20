package com.example.builderpatternjava.model;

public class NonVeganMealBuilder extends MealBuilder {

    private Meal meal;

    public NonVeganMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void addKebab() {
        this.meal.setKebab("spiceless");
    }

    @Override
    public void addBread() {
        this.meal.setBread("wheat bread");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Ayran");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Non-Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
