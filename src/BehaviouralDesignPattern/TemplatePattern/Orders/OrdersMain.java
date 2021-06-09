package BehaviouralDesignPattern.TemplatePattern.Orders;

public class OrdersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderProcessTemplate netOrder = new NetOrder();
        netOrder.placeOrder(true);
        System.out.println();
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.placeOrder(false);
	}

}
