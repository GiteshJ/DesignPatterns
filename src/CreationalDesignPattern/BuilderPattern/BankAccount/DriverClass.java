package CreationalDesignPattern.BuilderPattern.BankAccount;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount accOne = new BankAccount.Builder(1234L)
						.withOwner("Person 1")
						.atBranch("Branch 1")
						.openingBalance(1234.0)
						.atInterestRate(4.3)
						.build();
		
		BankAccount accTwo = new BankAccount.Builder(1256L)
				.withOwner("Person 2")
				.atBranch("Branch 2")
				.openingBalance(14434.0)
				.atInterestRate(5.3)
				.build();
		
		System.out.println(accOne.toString());
		System.out.println(accTwo.toString());

		
	}

}
