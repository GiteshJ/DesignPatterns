package StructuralDesignPattern.AdapterPattern.Pen;

public class DriverClass {

	public static void main(String[] args) {
		
		Pen p1 = new BallPointPen();
		Pen p2 = new AdvancePenAdapter(new PilotPen());
		
		AssignmentWork work = new AssignmentWork();
		work.setP(p1);
		work.writeAssignment("Hi I am Adapter Pattern");
		
		work.setP(p2);
		work.writeAssignment("Hi I am Adapter Pattern");
		
	}
	
}
