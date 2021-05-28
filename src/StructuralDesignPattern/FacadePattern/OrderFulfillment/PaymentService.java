package StructuralDesignPattern.FacadePattern.OrderFulfillment;

public class PaymentService {

	public static boolean makePayment(Product product) {
		// check with payment gateway for payment. Hardcoded to true for demo purpose
		return true;
	}
}
