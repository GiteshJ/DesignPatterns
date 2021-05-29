package StructuralDesignPattern.FlyweightPattern.CoffeShops;

import java.util.Random;

public enum CoffeeLatteArt {

	DISNEY("Disney"), LITTLE_BUNNY("Little Bunny"), FRENCH("French"), BARISTA_SWAG("Barista Swag"),
	FISHBONE("Fishbone"), MALAYSIAN_BUDDHA("Malaysian Buddha"), CAT("Cat");

	private String name;
	private static final Random random = new Random();

	CoffeeLatteArt(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static CoffeeLatteArt generateRandomCoffeeLatteArt() {
		CoffeeLatteArt[] values = CoffeeLatteArt.values();
        int length = values.length;
        int randIndex = random.nextInt(length);
        return values[randIndex];
    }

}