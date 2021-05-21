package CreationalDesignPattern.BuilderPattern.Pizza;

/* 
 * A customer ordering a pizza. 
 * */
public class DriverClass {
	
	public static void main(String[] args) {
		
		PizzaDirector pizzaDirector =  new PizzaDirector();
		PizzaBuilder pizzaBuilder;
		
		pizzaBuilder  = new HawaiianPizzaBuilder();
		
		pizzaDirector.setPizzaBuilder(pizzaBuilder);
		pizzaDirector.cookPizza();
		pizzaDirector.getPizza();
		
		pizzaBuilder  = new SpicyPizzaBuilder();
		
		pizzaDirector.setPizzaBuilder(pizzaBuilder);
		pizzaDirector.cookPizza();
		pizzaDirector.getPizza();
		
		
	}

}
