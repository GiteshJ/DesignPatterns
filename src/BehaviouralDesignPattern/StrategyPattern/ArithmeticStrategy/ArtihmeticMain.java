package BehaviouralDesignPattern.StrategyPattern.ArithmeticStrategy;

public class ArtihmeticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new AddStrategy());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new SubtractStrategy());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new MultiplyStrategy());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
