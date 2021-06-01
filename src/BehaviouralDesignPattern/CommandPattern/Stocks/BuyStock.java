package BehaviouralDesignPattern.CommandPattern.Stocks;

/*
 * concrete command
 */
public class BuyStock implements Order{
	
	public Stock stock;
	
	public BuyStock(Stock stock) {
		this.stock = stock;
	}
	
	public void execute() {
		this.stock.buy();
	}
	

}
