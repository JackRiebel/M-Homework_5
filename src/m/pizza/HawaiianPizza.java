package m.pizza;

import java.util.ArrayList;

public class HawaiianPizza extends AbstractPizza {

    public HawaiianPizza() {
        super();
        setPriceWithoutToppings(3.00);
        toppingList.add(Toppings.CANADIAN_BACON);
        toppingList.add(Toppings.CHEESE);
        toppingList.add(Toppings.PINEAPPLE);
        updatePizzaPrice();
    }

    public HawaiianPizza(HawaiianPizza other) {
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
