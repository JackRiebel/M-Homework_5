package m.cookingStrategy;

public enum CookingStyleType {
	MICROWAVE(1.0),
	CONVENTIONAL_OVEN(8.0),
	BRICK_OVEN(10.0);
	
	private final double cookingStylePrice;
	
	CookingStyleType (double cookingStylePrice){
		this.cookingStylePrice = cookingStylePrice;
	}
	
	public double getCookingStylePrice() {
		return cookingStylePrice;
	}
}
