package StructuralDesignPattern.AdapterPattern.Pen;

public class BallPointPen implements Pen{
	
	public void write(String args) {
		System.out.println("Writting with BallPoint pen - " + args);
	}
}
