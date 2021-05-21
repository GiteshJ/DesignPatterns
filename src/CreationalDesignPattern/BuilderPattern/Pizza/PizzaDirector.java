package CreationalDesignPattern.BuilderPattern.Pizza;

/*
 * Director
 */
public class PizzaDirector {
	
	public PizzaBuilder pizzaBuilder;

	public PizzaDirector() {
		
	}
	
	public PizzaDirector(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}
	
	public void cookPizza() {
		
		pizzaBuilder.createPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
		
	}

	public PizzaBuilder getPizzaBuilder() {
		return pizzaBuilder;
	}

	public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	} 
}
