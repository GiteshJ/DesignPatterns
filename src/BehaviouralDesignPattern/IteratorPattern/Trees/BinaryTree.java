package BehaviouralDesignPattern.IteratorPattern.Trees;

public class BinaryTree {

    Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public TreeIterator inOrderIterator() {
    	return new InOrderIterator(root);
    }
	
	public TreeIterator preOrderIterator() {
		return new PreOrderIterator(root);
	}
	
	public TreeIterator postOrderIterator() {
		return new PostOrderIterator(root);
	}
    
}
