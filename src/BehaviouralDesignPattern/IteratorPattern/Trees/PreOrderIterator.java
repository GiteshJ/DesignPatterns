package BehaviouralDesignPattern.IteratorPattern.Trees;

import java.util.ArrayList;
import java.util.List;

public class PreOrderIterator implements TreeIterator{

	
	protected int currentNode = 0;
	protected List<Node> nodes;
	public PreOrderIterator(Node root) {
		nodes = new ArrayList<>();
		traverseInOrder(root);
	}

	@Override
	public boolean hasNext() {
		return (currentNode < nodes.size() && nodes.get(currentNode) != null);
	}

	@Override
	public Node next() {
		return nodes.get(currentNode++);
	}
	
	public void traverseInOrder(Node node) {
        if (node != null) {
        	nodes.add(node);
            traverseInOrder(node.left);
            
            traverseInOrder(node.right);
        }
    }
}
