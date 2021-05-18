package BuilderPattern.BankAccount;

public class BankAccount {
	
	public static class Builder{
		
		
		private long accountNumber;
		String owner;
		String branch;
		double balance;
		double interestRate;
		
		public Builder(long accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		public Builder withOwner(String owner) {
			this.owner = owner;
			return this;
		}
		
		public Builder atBranch(String branch) {
			this.branch = branch;
			return this;
		}
		
		public Builder openingBalance(double balance) {
			this.balance = balance;
			return this;
		}
		
		public Builder atInterestRate(double interestRate) {
			this.interestRate = interestRate;
			return this;
		}
		
		public BankAccount build() {
			
			BankAccount acc = new BankAccount();
			acc.accountNumber = this.accountNumber;
			acc.owner = this.owner;
			acc.balance = this.balance;
			acc.branch = this.branch;
			acc.interestRate = this.interestRate;
			
			return acc;
		}
		
		
	}
	
	
	private long accountNumber;
	String owner;
	String branch;
	double balance;
	double interestRate;
	
	private BankAccount() {
		
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", owner=" + owner + ", branch=" + branch + ", balance="
				+ balance + ", interestRate=" + interestRate + "]";
	}

}
