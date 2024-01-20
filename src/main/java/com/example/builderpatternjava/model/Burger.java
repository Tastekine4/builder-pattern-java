package com.example.builderpatternjava.model;

public class Burger {

    private String size;

    private boolean egg;

    private boolean extraCheese;

    private boolean mayonnaise;

    private boolean onion;

    private boolean lettuce;

    private Burger(BurgerBuilder burgerBuilder) {
        this.egg = burgerBuilder.egg;
        this.extraCheese = burgerBuilder.extraCheese;
        this.size = burgerBuilder.size;
        // initialize all fields and also can add validations here!
    }

    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isMayonnaise() {
        return mayonnaise;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", egg=" + egg +
                ", extraCheese=" + extraCheese +
                ", mayonnaise=" + mayonnaise +
                ", onion=" + onion +
                ", lettuce=" + lettuce +
                '}';
    }

    // inner class builder

    public static class BurgerBuilder {

        private String size;

        private boolean egg;

        private boolean extraCheese;

        private boolean mayonnaise;

        private boolean onion;

        private boolean lettuce;

        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder egg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public BurgerBuilder mayonnaise(boolean mayonnaise) {
            this.mayonnaise = mayonnaise;
            return this;
        }

        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
