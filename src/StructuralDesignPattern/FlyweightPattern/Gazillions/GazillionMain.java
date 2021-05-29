
package StructuralDesignPattern.FlyweightPattern.Gazillions;

import StructuralDesignPattern.FlyweightPattern.Gazillions.After.FlyweightAfterDemo;
import StructuralDesignPattern.FlyweightPattern.Gazillions.Before.FlyweightBeforeDemo;;

public class GazillionMain {

	public static final int ROWS = 600, COLS = 10000;

	public static void main(String[] args) {
		
		long start1 = System.nanoTime();
		FlyweightBeforeDemo.test(ROWS, COLS);
		long end1 = System.nanoTime();
		System.out.println("Elapsed Before Time in nano seconds: " + (end1 - start1));
		
		
		long start2 = System.nanoTime();
		FlyweightAfterDemo.test(ROWS, COLS);
		long end2 = System.nanoTime();
		System.out.println("Elapsed After Time in nano seconds: " + (end2 - start2));
	}
}
