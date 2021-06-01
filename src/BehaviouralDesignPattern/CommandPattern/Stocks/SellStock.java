package BehaviouralDesignPattern.CommandPattern.Stocks;

/*
 * concrete command
 */
public class SellStock implements Order{
	public Stock stock;
	
	public SellStock(Stock stock) {
		this.stock = stock;
	}
	
	public void execute() {
		this.stock.sell();
	}
	
}
