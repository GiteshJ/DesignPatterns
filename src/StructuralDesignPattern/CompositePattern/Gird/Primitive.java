package StructuralDesignPattern.CompositePattern.Gird;

//2. "Isa" relationship
class Primitive implements Component {
	private int value;

	public Primitive(int val) {
		value = val;
	}

	public void traverse() {
		System.out.print(value + "  ");
	}
}