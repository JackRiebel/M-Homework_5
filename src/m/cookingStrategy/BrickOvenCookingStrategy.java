package m.cookingStrategy;

import m.pizza.AbstractPizza;

public class BrickOvenCookingStrategy implements ICookingStrategy
{
	private final double additional = 10;

	@Override
	public void cook(AbstractPizza pizza) 
	{
		System.out.println("Brick oven cooking method has been selected");
		double price = pizza.getTotalPrice();
		pizza.setTotalPrice(price + additional);
	}
		// TODO Auto-generated method stub
		
}
