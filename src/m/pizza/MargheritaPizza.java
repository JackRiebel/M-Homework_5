package m.pizza;

import java.util.ArrayList;

public class MargheritaPizza extends AbstractPizza {
    
    public MargheritaPizza() {
        super();
        setPriceWithoutToppings(2.50);
        toppingList.add(Toppings.TOMATO);
        toppingList.add(Toppings.CHEESE);
        updatePizzaPrice();
    }

    public MargheritaPizza(MargheritaPizza other) {
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

