package BehaviouralDesignPattern.TemplatePattern.Orders;

public abstract class OrderProcessTemplate {
	
	public boolean isGift;
	
	abstract void doSelect();
	abstract void doPayment();
	
	abstract void doDelivery();
	
	public void doGiftWrap() {
		System.out.println("Gift wrap successful");
	}
	
	public void placeOrder(boolean isGift) {
		this.isGift = isGift;
		doSelect();
		doPayment();
		if(isGift) doGiftWrap();
		doDelivery();
	}

}
