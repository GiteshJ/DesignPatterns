package BehaviouralDesignPattern.TemplatePattern.Car;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarTemplate car = new SportsCar();
		car.manufactureCar();
		if (car != null) {
			System.out.println("Below car delievered: ");
			System.out.println("======================================================================");
			System.out.println(car);
			System.out.println("======================================================================");
		}
		car = new ClassicCar();
		car.manufactureCar();
		if (car != null) {
			System.out.println("Below car delievered: ");
			System.out.println("======================================================================");
			System.out.println(car);
			System.out.println("======================================================================");
		}
		car = new ModernCar();
		car.manufactureCar();
		if (car != null) {
			System.out.println("Below car delievered: ");
			System.out.println("======================================================================");
			System.out.println(car);
			System.out.println("======================================================================");
		}
	}

}
