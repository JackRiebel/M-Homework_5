package m.cookingStrategy;

import m.pizza.AbstractPizza;

public class ConventionalOvenCookingStrategy implements ICookingStrategy{

	private final double additional = 8;

	@Override
	public void cook(AbstractPizza pizza) 
	{
		System.out.println("Conventional oven cooking method has been selected");
		double price = pizza.getTotalPrice();
		pizza.setTotalPrice(price + additional);
		// TODO Auto-generated method stub
		
	}

}

