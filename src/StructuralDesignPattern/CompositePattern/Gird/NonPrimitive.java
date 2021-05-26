package StructuralDesignPattern.CompositePattern.Gird;

//2. "Isa" relationship
public class NonPrimitive implements Component {
	private int value;

	public NonPrimitive(Object val) {
		value = Integer.parseInt(val.toString());
	}

	public void traverse() {
		System.out.print(value + "  ");
	}
}
