package BuilderPattern.Pizza;

/*
 * Concrete Builder
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {
	
	public void buildDough() {
		pizza.setDough("Pan Baked");
	}
	
	public void buildSauce() {
		pizza.setSauce("Hot");
	}
	
	public void buildTopping() {
		pizza.setTopping("ham+paineapple");
	}

}
