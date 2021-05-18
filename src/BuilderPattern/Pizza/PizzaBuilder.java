package BuilderPattern.Pizza;

/*
 * Abstract Builder
 */
public abstract class PizzaBuilder {

	protected Pizza pizza;
	
	public void createPizzaProduct() {
		pizza = new Pizza();
	}
	
	public Pizza getPizza() {
		System.out.println(pizza.toString());
		return pizza;
	}
	
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
	
}
