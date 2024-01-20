package com.example.builderpatternjava;

import com.example.builderpatternjava.model.Burger;
import com.example.builderpatternjava.model.Meal;
import com.example.builderpatternjava.model.MealDirector;
import com.example.builderpatternjava.model.VeganMealBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderPatternJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilderPatternJavaApplication.class, args);

		/*
		Using builder we have created the object and implemented.
		 */
		Burger burger = new Burger.BurgerBuilder().
				mayonnaise(true)
				.onion(false)
				.egg(false)
				.extraCheese(true)
				.size("small")
				.build();
		System.out.println(burger);
		/**
		 * GOF Builder Example
		 * Meal
		 * Meal Builder
		 * Meal Director
		 * NonVeganMealBuilder
		 * VeganMealBuilder
		 */
		Meal meal = new MealDirector(new VeganMealBuilder()).prepareMeal();
		System.out.println(meal);
    }

}
