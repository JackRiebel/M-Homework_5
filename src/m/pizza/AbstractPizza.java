package m.pizza;

import java.util.ArrayList;
import java.util.List;
import m.cookingStrategy.*;

public abstract class AbstractPizza {
    protected List<Toppings> toppingList;
    protected double priceWithoutToppings;
    protected double totalPrice;
    protected int pizzaOrderID;
    protected static int orderIDCounter = 0;
    protected ICookingStrategy cookingStrategy;
    protected double cookingPrice;

    public AbstractPizza() {
        toppingList = new ArrayList<>();
        pizzaOrderID = ++orderIDCounter;
    }

    // Setter and Getter methods
    public void setToppingList(List<Toppings> toppingList) {
        this.toppingList = toppingList;
    }

    public List<Toppings> getToppingList() {
        return toppingList;
    }

    public void setPriceWithoutToppings(double priceWithoutToppings) {
        this.priceWithoutToppings = priceWithoutToppings;
    }

    public double getPriceWithoutToppings() {
        return priceWithoutToppings;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getPizzaOrderID() {
        return pizzaOrderID;
    }

    public void setCookingStrategy(ICookingStrategy cookingStrategy) {
        this.cookingStrategy = cookingStrategy;
    }

    public ICookingStrategy getCookingStrategy() {
        return cookingStrategy;
    }

    // Abstract methods
    protected abstract double addToppingsToPrice(double priceWithoutToppings);
    public abstract double updatePizzaPrice();

    @Override
    public String toString() {
        return "AbstractPizza{" +
                "toppingList=" + toppingList +
                ", priceWithoutToppings=" + priceWithoutToppings +
                ", totalPrice=" + totalPrice +
                ", pizzaOrderID=" + pizzaOrderID +
                ", cookingStrategy=" + cookingStrategy +
                ", cookingPrice=" + cookingPrice +
                '}';
    }
}

