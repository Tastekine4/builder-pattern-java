package com.example.builderpatternjava.model;

public class Meal {

    private String curry;

    private String bread;

    private String coldDrink;

    private String kebab;

    public String getCurry() {
        return curry;
    }

    public String getBread() {
        return bread;
    }

    public String getColdDrink() {
        return coldDrink;
    }

    public String getKebab() {
        return kebab;
    }

    public void setCurry(String curry) {
        this.curry = curry;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setColdDrink(String coldDrink) {
        this.coldDrink = coldDrink;
    }

    public void setKebab(String kebab) {
        this.kebab = kebab;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "curry='" + curry + '\'' +
                ", bread='" + bread + '\'' +
                ", coldDrink='" + coldDrink + '\'' +
                ", kebab='" + kebab + '\'' +
                '}';
    }
}
