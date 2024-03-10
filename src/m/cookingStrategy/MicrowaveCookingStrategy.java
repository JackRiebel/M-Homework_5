package m.cookingStrategy;

public class MicrowaveCookingStrategy implements ICookingStrategy{
	
	
	private final double additional = 1;
	
	public void cook(Pizza pizza) {
		System.out.println("Microwave cooking method has been selected");
		int price = pizza.getPrice();
		pizza.setPrice(price + additional);
		// TODO Auto-generated method stub

}

}
