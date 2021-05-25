package StructuralDesignPattern.AdapterPattern.Shapes.ObjectAdapterPattern;

import StructuralDesignPattern.AdapterPattern.Shapes.GeometricShape.GeometricShape;
import StructuralDesignPattern.AdapterPattern.Shapes.GeometricShape.Rhombus;
import StructuralDesignPattern.AdapterPattern.Shapes.GeometricShape.Triangle;
import StructuralDesignPattern.AdapterPattern.Shapes.Shape.Shape;

public class GeometricShapeObjectAdapter implements Shape{
	
	GeometricShape geometricShape;
	
	public GeometricShapeObjectAdapter(GeometricShape geometricShape) {
		this.geometricShape = geometricShape;
	}

	public void draw() {
		geometricShape.drawShape();
	}
	
	public boolean isHide() {
		return false;
	}
	
	public String description() {
		if(geometricShape instanceof Triangle) return  " Triangle Object!";
		else if(geometricShape instanceof Rhombus) return  " Rhombus Object!";
		else return  " Unknown Object!";
		
	}
	
	public void resize() {
		System.out.println(" Adapted Object cannot be resized!");
	}
}
