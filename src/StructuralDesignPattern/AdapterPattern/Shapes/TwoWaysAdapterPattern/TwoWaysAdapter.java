package StructuralDesignPattern.AdapterPattern.Shapes.TwoWaysAdapterPattern;

import StructuralDesignPattern.AdapterPattern.Shapes.GeometricShape.GeometricShape;
import StructuralDesignPattern.AdapterPattern.Shapes.GeometricShape.Rhombus;
import StructuralDesignPattern.AdapterPattern.Shapes.GeometricShape.Triangle;
import StructuralDesignPattern.AdapterPattern.Shapes.Shape.Circle;
import StructuralDesignPattern.AdapterPattern.Shapes.Shape.Rectangle;
import StructuralDesignPattern.AdapterPattern.Shapes.Shape.Shape;

public class TwoWaysAdapter implements Shape, GeometricShape {

	// sides
	private ShapeType shapeType;

	public TwoWaysAdapter() {
		this(ShapeType.TRIANGLE);
	}

	public TwoWaysAdapter(ShapeType shapeType) {
		super();
		this.shapeType = shapeType;
	}

	@Override
	public void draw() {
		switch (shapeType) {
		case CIRCLE:
			new Circle().draw();
			break;
		case RECTANGLE:
			new Rectangle().draw();
			break;
		case TRIANGLE:
			new Triangle().drawShape();
			break;
		case RHOMBUS:
			new Rhombus().drawShape();
			break;
		}
	}

	@Override
	public void resize() {
		switch (shapeType) {
		case CIRCLE:
			new Circle().resize();
			break;
		case RECTANGLE:
			new Rectangle().resize();
			break;
		case TRIANGLE:
			System.out.println("Triangle can't be resized. Please create new one with required values.");
			break;
		case RHOMBUS:
			System.out.println("Rhombus can't be resized. Please create new one with required values.");
			break;
		}
	}

	@Override
	public String description() {
		switch (shapeType) {
		case CIRCLE:
			return new Circle().description();
		case RECTANGLE:
			return new Rectangle().description();
		case TRIANGLE:
			return "Triangle object";
		case RHOMBUS:
			return "Rhombus object";
		}
		return "Unknown object";
	}

	@Override
	public boolean isHide() {
		return false;
	}

	@Override
	public double area() {
		switch (shapeType) {
		case CIRCLE:
		case RECTANGLE:
			return 0.0d;
		case TRIANGLE:
			return new Triangle().area();
		case RHOMBUS:
			return new Rhombus().area();
		}
		return 0.0d;
	}

	@Override
	public double perimeter() {
		switch (shapeType) {
		case CIRCLE:
		case RECTANGLE:
			return 0.0d;
		case TRIANGLE:
			return new Triangle().perimeter();
		case RHOMBUS:
			return new Rhombus().perimeter();
		}
		return 0.0d;
	}

	@Override
	public void drawShape() {
		draw();
	}

}