package br.com.cod3r.builder.traditional.meal;

import br.com.cod3r.builder.traditional.meal.builder.ComboBuilder;
import br.com.cod3r.builder.traditional.meal.director.MealDirector;

public class Client {
	
	public static void main(String[] args) {
		MealDirector director = new MealDirector(new ComboBuilder());
		director.constructMeal();
		System.out.println(director.getMeal());
	}
}