package m.cookingStrategy;

import m.pizza.AbstractPizza;

public class MicrowaveCookingStrategy implements ICookingStrategy{
	
	
	private final double additional = 1;
	
	public void cook(AbstractPizza pizza) {
		System.out.println("Microwave cooking method has been selected");
		double price = pizza.getTotalPrice();
		pizza.setTotalPrice(price + additional);
		// TODO Auto-generated method stub

}

}
