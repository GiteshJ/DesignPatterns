package StructuralDesignPattern.AdapterPattern.Pen;

public class AssignmentWork {
	
	public Pen p;

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}
	
	public void writeAssignment(String args) {
		p.write(args);
	}

}
