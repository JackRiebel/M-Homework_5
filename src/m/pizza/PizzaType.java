package m.pizza;

public enum PizzaType {
    MARGHERITA(2.50),
    VEGETARIAN(1.50),
    HAWAIIAN(3.00),
    SUPREME(3.50);

    private final double toppingPrice;

    PizzaType(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }
}

