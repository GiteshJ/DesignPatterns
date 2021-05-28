package StructuralDesignPattern.FacadePattern.HomeAppliance;

import java.util.Arrays;

/*
 * refer -  https://dzone.com/articles/facade-design-pattern-in-java
 * github - https://github.com/BrijeshSaxena/design-pattern-facade
 */
public class HomeApplianceMain {
	public static void main(String[] args) {
		HomeFacade home = new HomeFacade();
		System.out.println("Weekend: Enjoying with friends and family at home...");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Setting up movie...");
		home.playMovieOnNetflix("Spider-Man: Far From Home");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Preparing food...");
		home.prepareFood(Arrays.asList("Napoletana Pizza", "Margherita Pizza", "Marinara Pizza",
				"Chicago-Style Deep Dish Pizza"));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Enjoy Movie with Meal and Drink...");
		System.out.println("Movie Completed.");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Stopping Movie...");
		home.stopMovie();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Closing Kitchen...");
		home.closeKitchen();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Done!");
	}
}
