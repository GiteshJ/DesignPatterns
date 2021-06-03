package BehaviouralDesignPattern.IteratorPattern.Trees;

import java.util.ArrayList;
import java.util.List;

public class PostOrderIterator implements TreeIterator{

	
	protected int currentNode = 0;
	protected List<Node> nodes;
	public PostOrderIterator(Node root) {
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
            
            traverseInOrder(node.right);
            nodes.add(node);
        }
    }
}
