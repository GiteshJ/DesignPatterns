package CreationalDesignPattern.PrototypeDesignPattern.Tree;


public class DriverClass {

	
	public static  void main(String[] args) {
		
		testPlasticTree();
		
		
		testPineTree();
		
	}
	
    public static void testPlasticTree() {
        double mass = 10.0;
        double height = 3.7;
        Position position = new Position(3, 7);

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        
        System.out.println(position.hashCode() == plasticTree.getPosition().hashCode());
        System.out.println(position.hashCode() ==  anotherPlasticTree.getPosition().hashCode());
       
    }

    public static void testPineTree() {
        double mass = 10.0;
        double height = 3.7;
        Position position = new Position(3, 7);

        PineTree pineTree = new PineTree(mass, height);
        pineTree.setPosition(position);
        PineTree anotherPineTree = (PineTree) pineTree.copy();

        System.out.println(position.hashCode() ==  pineTree.getPosition().hashCode());
        System.out.println(position.hashCode() == anotherPineTree.getPosition().hashCode());
    }
    
}