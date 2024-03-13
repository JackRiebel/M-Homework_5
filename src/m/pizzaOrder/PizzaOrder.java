package m.pizzaOrder;

import java.util.ArrayList;
import java.util.List;

import m.cookingStrategy.CookingStyleType;
import m.cookingStrategy.ICookingStrategy;
import m.pizza.AbstractPizza;
import m.pizza.PizzaType;
import m.pizza.Toppings;

public class PizzaOrder {
	
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;

	public PizzaOrder() {
		pizzaOrderList = new ArrayList<>();
	}
	
	// printListOfToppingsByPizzaOrderID Method
		public void printListOfToppingsByPizzaOrderID(int orderID) {
			for (AbstractPizza pizza : pizzaOrderList) {
				if (AbstractPizza.getPizzaOrderID() == orderID) {
					List<Toppings> toppings = pizza.getToppingList();
					System.out.println("Toppings for Order ID " + orderID);
					for (Toppings topping : toppings) {
						System.out.println(toppings);
					}
				}
				System.out.println("No pizza with the Order ID " + orderID + " has been found");
			}
		}
	
	
	public void printPizzaOrderCart(int orderID) {
		for (AbstractPizza pizza : pizzaOrderList) {
			System.out.println(pizza);
		}
	}
	
	public AbstractPizza getPizzaByOrderID(int orderID) {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (AbstractPizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;
	}
	
	public boolean addPizzaToCart(PizzaType pizzaType) {
		
		return false;
	}
	
	// addNewToppingsToPizza Method
		public boolean addNewToppingsToPizza(int orderID, Toppings toppings) {
			for (AbstractPizza pizza : pizzaOrderList) {
				if (AbstractPizza.getPizzaOrderID() == orderID) {
					if (pizza.getToppingList().contains(toppings)) {
						return false;
					} else {
						pizza.getToppingList().add(toppings);
						pizza.updatePizzaPrice();
					}
				}
			}
			return false;
		}
	
		
	//removeToppingsFromPizza Method
	public boolean removeToppingsFromPizza(int orderID, Toppings toppings) {
		for (AbstractPizza pizza : pizzaOrderList) {
			if (AbstractPizza.getPizzaOrderID() == orderID) {
				if (pizza.getToppingList().contains(toppings)) {
					pizza.getToppingList().remove(toppings);
					pizza.updatePizzaPrice();
				} else {
					return false;
				}
			}
		}
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
			if (AbstractPizza.getPizzaOrderID() == orderID) {
				pizza.setCookingStrategy(cookingStrategy);
			}
		}
		
		
		return false;
	}
	

}
