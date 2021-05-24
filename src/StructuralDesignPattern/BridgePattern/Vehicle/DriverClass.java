package StructuralDesignPattern.BridgePattern.Vehicle;

public class DriverClass {
	
	public static void main(String[] args) {
		
		pipeline(new Bike());
		pipeline(new Car());
		
	}
	
	public static void pipeline(Vehicle vehicle) {
		
		Workshop producer = new ProduceWorkshop(vehicle);
		producer.work();
		Workshop assembler = new AssembleWorkshop(vehicle);
		assembler.work();
		Workshop tester = new TestWorkshop(vehicle);
		tester.work();
		Workshop painter = new PaintWorkshop(vehicle);
		painter.work();
		
		
	}

}
