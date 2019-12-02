
public class SavingsAccount extends Account{
	double transactionFee = 2.50;
	double minimumSavings = 20.00;
	double promotionAmount = 10000.00;
	double promotionPrice = 500.00;
	
	//checked
	public SavingsAccount(String id, double balance) {
			super(id, balance);
			if(balance >= promotionAmount) {
				deposit(promotionPrice);
			}
	}
	//checked
	public boolean withdraw(double amount) {
		if((balance - amount) < minimumSavings) {
			return false;
		}
		else {
			balance = balance - (amount + transactionFee);
			return true;
		}
	}
	//checked
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public double addInterest(double rate) {
		double interest = (balance * (rate/100));
		balance = balance + interest;
		return interest;
	}
	
	
	
	
	
	
	
	
	
	
	
}
