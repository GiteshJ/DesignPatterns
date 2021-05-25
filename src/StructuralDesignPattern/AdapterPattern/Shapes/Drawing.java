package StructuralDesignPattern.AdapterPattern.Shapes;

import java.util.ArrayList;
import java.util.List;

import StructuralDesignPattern.AdapterPattern.Shapes.Shape.Shape;

/*
 * https://dzone.com/articles/adapter-design-pattern-in-java
 */
public class Drawing {

	List<Shape> shapes = new ArrayList<Shape>();

	public Drawing() {
		super();
	}

	public void addShape(Shape shape) {
		shapes.add(shape);
	}

	public List<Shape> getShapes() {
		return new ArrayList<Shape>(shapes);
	}

	public void draw() {
		if (shapes.isEmpty()) {
			System.out.println("Nothing to draw!");
		} else {
			shapes.stream().forEach(shape -> shape.draw());
		}
	}

	public void resize() {
		if (shapes.isEmpty()) {
			System.out.println("Nothing to resize!");
		} else {
			shapes.stream().forEach(shape -> shape.resize());
		}
	}

	public void description() {
		if (shapes.isEmpty()) {
			System.out.println("Nothing to draw!");
		} else {
			shapes.stream().forEach(shape -> System.out.println(shape.description()));
		}
	}
}