package BehaviouralDesignPattern.CommandPattern.Stocks;

import java.util.ArrayList;
import java.util.List;

/*
 * invoker
 */
public class Broker {
	
	List<Order> orders = new ArrayList<>();
	
	public  void takeOrders(Order order) {
		orders.add(order);
	}
	
	public void placeOrders() {
		if(!orders.isEmpty()) orders.parallelStream().forEach(order -> {order.execute();});
		orders.clear();
	}
}
