package br.com.cod3r.builder.spolleto.after.director;

import br.com.cod3r.builder.spolleto.after.builder.MealBuilder;
import br.com.cod3r.builder.spolleto.after.model.Meal;

public class MealDirector<T extends Meal> {
	
	private MealBuilder<T> builder;

	public MealDirector(MealBuilder<T> builder) {
		this.builder = builder;
	}
	
	public void cook() {
		builder.addCheese();
		builder.addPepper();
		builder.addSauces();
		builder.addToppings();
	}
	
	public T getOrder() {
		return builder.getMeal();
	}

}
