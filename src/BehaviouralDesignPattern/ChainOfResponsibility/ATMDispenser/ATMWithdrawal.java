package BehaviouralDesignPattern.ChainOfResponsibility.ATMDispenser;

public class ATMWithdrawal {
	
	public static final PaperCurrencyDispenser hundred = new HundredDispenser();
	public static final PaperCurrencyDispenser fifty = new FiftyDispenser();
	public static final PaperCurrencyDispenser twenty = new TwentyDispenser();
	public static final PaperCurrencyDispenser ten = new TenDispenser();
	public static PaperCurrencyDispenser currencyChain ;
	
	static {
		hundred.setNextDispenser(fifty);
		fifty.setNextDispenser(twenty);
		twenty.setNextDispenser(ten);
		currencyChain = hundred;
	}
	
	public static void withdraw(PaperCurrency currency) {
		if (currency != null) currencyChain.dispense(currency);
	}

}
