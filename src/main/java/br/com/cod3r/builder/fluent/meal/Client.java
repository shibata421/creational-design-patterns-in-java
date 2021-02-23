package br.com.cod3r.builder.fluent.meal;

import br.com.cod3r.builder.fluent.meal.builder.FastFoodMeal;
import br.com.cod3r.builder.fluent.meal.builder.FastFoodMealBuilder;

public class Client {
	
	public static void main(String[] args) {
		FastFoodMeal meal = new FastFoodMealBuilder()
				.withMain("Burger")
				.withDessert("Cake")
				.withSide("Onion rings")
				.thatsAll();
		System.out.println(meal);
		System.out.println("---------------------");
	
		FastFoodMeal meal2 = new FastFoodMealBuilder()
				.withMain("X-Burger")
				.withDessert("Ice cream")
				.withSide("Polenta")
				.withDrink("Water")
				.thatsAll();
		System.out.println(meal2);
		System.out.println("---------------------");
	}
}