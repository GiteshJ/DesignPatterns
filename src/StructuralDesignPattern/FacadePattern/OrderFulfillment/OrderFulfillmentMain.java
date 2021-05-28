package StructuralDesignPattern.FacadePattern.OrderFulfillment;

public class OrderFulfillmentMain {

	public static void main(String[] args) {
		OrderServiceFacade orderFacade =  new OrderServiceFacadeImpl();
		boolean orderFulfilled = orderFacade.placeOrder(1, "Phone");
		if (orderFulfilled) System.out.println("OrderFacade : Order Confirmed !!");
		else System.out.println("OrderFacade : Order Failed !! Retry !!!");
	}
}
