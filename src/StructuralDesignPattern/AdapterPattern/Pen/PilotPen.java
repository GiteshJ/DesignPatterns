package StructuralDesignPattern.AdapterPattern.Pen;

public class PilotPen implements AdvancePen{

	
	public void mark(String args) {
		System.out.println("Writting with Pilot pen - " + args);
	}
}
