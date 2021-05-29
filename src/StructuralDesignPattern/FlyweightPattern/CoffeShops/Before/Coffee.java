package StructuralDesignPattern.FlyweightPattern.CoffeShops.Before;

import StructuralDesignPattern.FlyweightPattern.CoffeShops.CoffeeFlavour;
import StructuralDesignPattern.FlyweightPattern.CoffeShops.CoffeeLatteArt;

public class Coffee {

	protected final CoffeeFlavour flavourName;
	protected final CoffeeLatteArt latteArt;

	protected Coffee(CoffeeFlavour flavourName, CoffeeLatteArt latteArt) {
		super();
		this.flavourName = flavourName;
		this.latteArt = latteArt;
	}

	public CoffeeFlavour getFlavourName() {
		return flavourName;
	}

	public CoffeeLatteArt getLatteArt() {
		return latteArt;
	}

}