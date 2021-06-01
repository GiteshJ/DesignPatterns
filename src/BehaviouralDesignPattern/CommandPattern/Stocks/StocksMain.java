package BehaviouralDesignPattern.CommandPattern.Stocks;


/*
 * client
 */
public class StocksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock stock = new Stock("Reliance",100);

		BuyStock buyStockOrder = new BuyStock(stock);
		SellStock sellStockOrder = new SellStock(stock);

		Broker broker = new Broker();
		broker.takeOrders(buyStockOrder);
		broker.takeOrders(sellStockOrder);

		broker.placeOrders();
	}

}
