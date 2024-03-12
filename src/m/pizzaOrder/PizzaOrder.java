package m.pizzaOrder;

import java.util.ArrayList;
import java.util.List;

import m.cookingStrategy.CookingStyleType;
import m.cookingStrategy.ICookingStrategy;
import m.pizza.AbstractPizza;
import m.pizza.PizzaType;

public class PizzaOrder {
	
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;

	public PizzaOrder() {
		pizzaOrderList = new ArrayList<>();
		
	}
	
	public void printPizzaOrderCart(int orderID) {
		for (AbstractPizza pizza : pizzaOrderList) {
			System.out.println(pizza);
		}
	}
	
	public AbstractPizza getPizzaByOrderID(int orderID) {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;
	}
	
	public boolean addPizzaToCart(PizzaType pizzaType) {
		
		return false;
	}
	
	public boolean isThereAnyUncookedPizza() {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getCookingStrategy() == null) {
				return true;
			}
		}
		return false;
	}
	
	public double Checkout() throws Exception {
		if (isThereAnyUncookedPizza()) {
			throw new Exception("There are uncooked pizzas!");
		}
		double Total = 0.0;
		for (AbstractPizza pizza : pizzaOrderList){
			Total += pizza.getTotalPrice();
		}
		return Total;
	}
	
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getPizzaOrderID() == orderID) {
				pizza.cook()
			}
		}
		
		
		return false;
	}

}
