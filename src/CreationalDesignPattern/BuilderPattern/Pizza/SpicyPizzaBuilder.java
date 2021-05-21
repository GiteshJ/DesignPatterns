package CreationalDesignPattern.BuilderPattern.Pizza;


/*
 * Concrete Builder
 */
public class SpicyPizzaBuilder extends PizzaBuilder {
	
	public void buildDough() {
		pizza.setDough("Wheat");
	}
	
	public void buildSauce() {
		pizza.setSauce("Mild");
	}
	
	public void buildTopping() {
		pizza.setTopping("mushroom+corn");
	}

}
