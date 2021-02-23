package br.com.cod3r.builder.traditional.meal.director;

import br.com.cod3r.builder.traditional.meal.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.traditional.meal.model.FastFoodMeal;

public class MealDirector {

	private FastFoodMealBuilder builder;

	public MealDirector(FastFoodMealBuilder builder) {
		this.builder = builder;
	}
	
	public void constructMeal() {
		builder.buildDrink();
		builder.buildDessert();
		builder.buildGift();
		builder.buildMain();
		builder.buildSide();
	}
	
	public FastFoodMeal getMeal() {
		return builder.getMeal();
	}
}
