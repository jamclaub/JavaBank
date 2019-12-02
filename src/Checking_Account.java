
public class Checking_Account extends Account{
	
	double transactionFee = 1.00;
	private int checkCount = 0;
	
	public Checking_Account(String id, double balance) {
		super(id, balance);
	}
	//checked
	public boolean withdraw(double amount) {
		if((balance - (amount + transactionFee) < 0)){
			return false;
		}
		else {
			balance = balance - (amount + transactionFee);
			return true;
		}
	}
	//checked
	public void deposit(double amount) {
		balance = balance + (amount - transactionFee);
	}
	
	public void resetChecksUsed() {
		checkCount = 0;
	}

	public int getChecksUsed() {
		return checkCount;
	}
	//checked
	public boolean withdrawUsingCheck(double amount) {
		if(checkCount < 3) {
			if((balance - (amount + transactionFee) < -10)){
				return false;
			}
			balance = balance - (amount + transactionFee);
			checkCount++;
			return true;
		}
		else {
			if((balance - (amount + transactionFee + 2) < -10)){
				return false;
			}
			balance = balance - (amount + transactionFee + 2);
			checkCount++;
			return true;
		}
	}
}

