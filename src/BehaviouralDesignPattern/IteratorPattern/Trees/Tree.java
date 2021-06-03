package BehaviouralDesignPattern.IteratorPattern.Trees;

public interface Tree {

	public TreeIterator inOrderIterator();
	
	public TreeIterator preOrderIterator();
	
	public TreeIterator postOrderIterator();
	
}
