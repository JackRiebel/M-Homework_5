package m.cookingStrategy;

public class ConventionalOvenCookingStrategy implements ICookingStrategy{

	private final double additional = 8;

	@Override
	public void cook(Pizza pizza) {
		System.out.println("Conventional oven cooking method has been selected");
		int price = pizza.getPrice();
		pizza.setPrice(price + additional);
		// TODO Auto-generated method stub
		
	}

}
