package m.pizzaOrder;

import m.pizza.AbstractPizza;
import m.pizza.HawaiianPizza;
import m.pizza.MargheritaPizza;
import m.pizza.SupremePizza;
import m.pizza.VegetarianPizza;
import m.pizza.PizzaType;

public class PizzaCookingFactory {
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		AbstractPizza pizza = null;
		
		switch (pizzaType) {
			case HAWAIIAN:
				pizza = new HawaiianPizza();
				break;
			case MARGHERITA:
				pizza = new MargheritaPizza();
				break;
			case SUPREME:
				pizza = new SupremePizza();
				break;
			case VEGETARIAN:
				pizza = new VegetarianPizza();
				break;
			default:
				throw new IllegalArgumentException("Unknown Pizza Type " + pizzaType);
		}
		pizza.setPizzaOrderID(AbstractPizza.getPizzaOrderID());
		
		return pizza;
	}
}
