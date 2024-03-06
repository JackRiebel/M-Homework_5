package m.pizza;

import java.util.ArrayList;

public class SupremePizza extends AbstractPizza {

    public SupremePizza() {
        super();
        setPriceWithoutToppings(3.50);
        toppingList.add(Toppings.TOMATO);
        toppingList.add(Toppings.CHEESE);
        toppingList.add(Toppings.BELL_PEPPER);
        toppingList.add(Toppings.ITALIAN_SAUSAGE);
        toppingList.add(Toppings.PEPPERONI);
        toppingList.add(Toppings.BLACK_OLIVE);
        toppingList.add(Toppings.MUSHROOM);
        updatePizzaPrice();
    }

    public SupremePizza(SupremePizza other) {
        this.toppingList = new ArrayList<>(other.toppingList);
        this.priceWithoutToppings = other.priceWithoutToppings;
        this.totalPrice = other.totalPrice;
        this.cookingStrategy = other.cookingStrategy;
    }

    @Override
    protected double addToppingsToPrice(double priceWithoutToppings) {
        double toppingsPrice = toppingList.stream().mapToDouble(Toppings::getPrice).sum();
        return priceWithoutToppings + toppingsPrice;
    }

    @Override
    public double updatePizzaPrice() {
        totalPrice = addToppingsToPrice(priceWithoutToppings);
        return totalPrice;
    }
}
