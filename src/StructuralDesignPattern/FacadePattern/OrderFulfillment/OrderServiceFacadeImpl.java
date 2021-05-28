package StructuralDesignPattern.FacadePattern.OrderFulfillment;

public class OrderServiceFacadeImpl implements OrderServiceFacade{

	public boolean placeOrder(int id, String name) {
		
		boolean orderFulfilled = false;
		Product product = new Product(id,name);
		
		if(InventoryService.isAvailable(product)) {
			System.out.println("Product with ID : " + product.getProductId() + " is Available !");
			boolean paymentConfirmed = PaymentService.makePayment(product);
			if(paymentConfirmed) {
				System.out.println("Payment Confirmed !!");
				ShipmentService.shipProduct(product);
				System.out.println("Shipment Confirmed !!");
				orderFulfilled = true;
			}
		}
		
		return orderFulfilled;
	}
}
