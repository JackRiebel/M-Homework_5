package m.main;
import m.pizzaOrder.PizzaOrder;
public class Main {
	
public static void main(String[] args) {
//Instantiate New Pizza
PizzaOrder order = new PizzaOrder();
	
//Adds pizza to cart
order.addPizzaToCart(null);
	
//Select cooking operation for pizza
order.selectCookingStrategyByPizzaOrderID(0, null);

//Prints pizza in cart function
order.printPizzaOrderCart(0);

//checkout function
try {
	order.Checkout();
} catch (Exception e) {
	System.out.println("Error: Please try again");
	e.printStackTrace();
}

	
}
