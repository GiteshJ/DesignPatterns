package StructuralDesignPattern.FlyweightPattern.CoffeShops;

import StructuralDesignPattern.FlyweightPattern.CoffeShops.After.CoffeeShopAfterMain;
import StructuralDesignPattern.FlyweightPattern.CoffeShops.Before.CoffeeShopBeforeMain;

/*
 * https://dzone.com/articles/using-flyweight-design-pattern-in-java
 */
public class CoffeeShopBeforeAfterDemo {

	//change this to see how time is effected
	public static int ORDER  = 1000;
	
	public static void main(String[] args) {
		
		long start1 = System.nanoTime();
		CoffeeShopBeforeMain.testBefore(ORDER);
		long end1 = System.nanoTime();
		System.out.println("Elapsed Before Time in seconds: " + (double)(end1 - start1)/1000000000);
		
		
		long start2 = System.nanoTime();
		CoffeeShopAfterMain.testAfter(ORDER);
		long end2 = System.nanoTime();
		System.out.println("Elapsed After Time in seconds: " + (double)(end2 - start2)/1000000000);

	}

}
