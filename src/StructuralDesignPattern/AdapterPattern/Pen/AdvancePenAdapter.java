package StructuralDesignPattern.AdapterPattern.Pen;

public class AdvancePenAdapter implements Pen{
	
	AdvancePen pen;
	
	public AdvancePenAdapter(AdvancePen pen) {
		this.pen = pen;
	}
	
	public void write(String args) {
		pen.mark(args);
	}

}
