package com.example.builderpatternjava.model;

public abstract class MealBuilder {

    public abstract void addKebab();

    public abstract void addBread();

    public abstract void addColdDrink();

    public abstract void addCurry();

    public abstract Meal build();

}
