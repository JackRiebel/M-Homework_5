package m.cookingStrategy;

public class BrickOvenCookingStrategy implements ICookingStrategy
{
	private final double additional = 10;

	@Override
	public void cook(Pizza pizza) {
		System.out.println("Brick oven cooking method has been selected");
		int price = pizza.getPrice();
		pizza.setPrice(price + additional);
		// TODO Auto-generated method stub
		
	}

}
