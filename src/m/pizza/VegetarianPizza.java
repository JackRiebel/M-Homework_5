package m.pizza;

import java.util.ArrayList;

public class VegetarianPizza extends AbstractPizza {

    public VegetarianPizza() {
        super();
        setPriceWithoutToppings(1.50);
        toppingList.add(Toppings.TOMATO);
        toppingList.add(Toppings.CHEESE);
        toppingList.add(Toppings.BELL_PEPPER);
        toppingList.add(Toppings.BLACK_OLIVE);
        toppingList.add(Toppings.MUSHROOM);
        updatePizzaPrice();
    }

    public VegetarianPizza(VegetarianPizza other) {
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
