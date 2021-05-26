package StructuralDesignPattern.CompositePattern.Packages;

public class PackageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Package prod1 = new Product(10);
		Package prod2 = new Product(5);
		
		Boxes box1 = new Boxes(5);
		box1.addPackage(prod1);
		box1.addPackage(prod2);
		
		System.out.println("Box 1 Cost - " + box1.getPrice()  );
		
		Package prod3 = new Product(10);
		Package prod4 = new Product(15);
		
		Boxes box2 = new Boxes(15);
		box2.addPackage(prod3);
		box2.addPackage(prod4);
		
		System.out.println("Box 2 Cost - " + box2.getPrice()  );
		
		Boxes box3 = new Boxes(25);
		box3.addPackage(box1);
		box3.addPackage(box2);
		
		System.out.println("Box 3 Cost - " + box3.getPrice()  );
		

	}

}
