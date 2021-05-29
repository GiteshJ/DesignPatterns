package StructuralDesignPattern.FlyweightPattern.CoffeShops;

import java.util.Random;

public enum CoffeeFlavour {

	CAPPUCCINO("Cappuccino"), ESPRESSO("Espresso"), FRAPPUCCINO("Frappuccino"), AFFOGATO("Affogato"), LATTE("Latte");

	private String name;
	private static final Random random = new Random();
	
	CoffeeFlavour(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static CoffeeFlavour generateRandomCoffeeFlavour() {
		CoffeeFlavour[] values = CoffeeFlavour.values();
        int length = values.length;
        int randIndex = random.nextInt(length);
        return values[randIndex];
    }

}