package StructuralDesignPattern.DecoratorPattern.Christmas;

public abstract class TreeDecorator implements ChristmasTree {
	
	private ChristmasTree tree;
	
	public TreeDecorator(ChristmasTree tree) {
		super();
		this.tree = tree;
	}

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
