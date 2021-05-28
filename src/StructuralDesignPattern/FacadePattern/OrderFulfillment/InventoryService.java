package StructuralDesignPattern.FacadePattern.OrderFulfillment;

public class InventoryService {
	
	public static boolean isAvailable(Product product) {
		// check warehouse and return accordingly . hardcoded to true for demo purpose
		return true;
	}

}
