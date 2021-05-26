package StructuralDesignPattern.CompositePattern.Packages;

public class Product implements Package{

	public int price;
	
	public Product(int price) {
		this.price =  price;
	}
	
	public int getPrice() {
		return price;
	}
}
