package com.example.builderpatternjava.model;

public class VeganMealBuilder extends MealBuilder {

    private Meal meal;

    public VeganMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void addKebab() {
        this.meal.setKebab("spicy");
    }

    @Override
    public void addBread() {
        this.meal.setBread("None");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Fanta");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
