package BehaviouralDesignPattern.IteratorPattern.Trees;

import java.util.ArrayList;
import java.util.List;

public class InOrderIterator implements TreeIterator{

	
	protected int currentNode = 0;
	protected List<Node> nodes;
	public InOrderIterator(Node root) {
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
            traverseInOrder(node.left);
            nodes.add(node);
            traverseInOrder(node.right);
        }
    }
}
