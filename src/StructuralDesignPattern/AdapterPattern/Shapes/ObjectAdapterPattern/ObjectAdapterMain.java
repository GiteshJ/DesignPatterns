package StructuralDesignPattern.AdapterPattern.Shapes.ObjectAdapterPattern;

import StructuralDesignPattern.AdapterPattern.Shapes.Drawing;
import StructuralDesignPattern.AdapterPattern.Shapes.GeometricShape.Rhombus;
import StructuralDesignPattern.AdapterPattern.Shapes.GeometricShape.Triangle;
import StructuralDesignPattern.AdapterPattern.Shapes.Shape.Circle;
import StructuralDesignPattern.AdapterPattern.Shapes.Shape.Rectangle;

public class ObjectAdapterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));

        System.out.println("Drawinxg...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
        System.out.println("Description...");
        drawing.description();
	}

}
