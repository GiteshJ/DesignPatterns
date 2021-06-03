package BehaviouralDesignPattern.IteratorPattern.Trees;

public class TreeMain {
	
	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();

	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	    
	    System.out.println(
				"---------------------------------------InOrder Traversal---------------------------------------");
	    printNodes(bt.inOrderIterator());
	    System.out.println(
				"---------------------------------------PreOrder Traversal--------------------------------------");
	    printNodes(bt.preOrderIterator());
	    System.out.println(
				"---------------------------------------PostOrder Traversal-------------------------------------");
	    printNodes(bt.postOrderIterator());

	}
	
	
	
	
	private static void printNodes(TreeIterator iterator) {
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		while (iterator.hasNext()) {
			Node node = (Node)iterator.next();
			System.out.println(node.toString());
		}
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println();
	}
	
	
	
	
	
	
	
	
	

}
