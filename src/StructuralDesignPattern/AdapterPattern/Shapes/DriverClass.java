package StructuralDesignPattern.AdapterPattern.Shapes;

import StructuralDesignPattern.AdapterPattern.Shapes.Shape.Circle;
import StructuralDesignPattern.AdapterPattern.Shapes.Shape.Rectangle;

public class DriverClass {

	public static void main(String[] args) {
		System.out.println("Creating drawing of shapes...");
		Drawing drawing = new Drawing();
		drawing.addShape(new Rectangle());
		drawing.addShape(new Circle());

		System.out.println("Drawing...");
		drawing.draw();
		System.out.println("Resizing...");
		drawing.resize();
		System.out.println("Description...");
		drawing.description();
	}

}
