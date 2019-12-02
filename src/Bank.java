import java.util.ArrayList;
public class Bank {
	
	private ArrayList<Account> accounts;
	private double savingsInterestRate;
	
	Bank() {
		accounts = new ArrayList<Account>();

	}
	
	//checked
	public void setSavingsInterest(double rate) {
		savingsInterestRate = rate;
	}
	//checked
	public int numberOfAccounts() {
		return accounts.size();
	}
	//checked
	public void addAccount(Account a) {
		accounts.add(a);
	}
	//checked
	public Account getAccount(String accountID) {
		for (int i = 0; i < numberOfAccounts(); i++) {
			if(accounts.get(i).getID() == accountID) {
				return accounts.get(i);
			}	
		}
		return null;
	}
	//checked
	public boolean deposit(String accountID, double amount) {
		for (int i = 0; i < numberOfAccounts(); i++) {
			if(accounts.get(i).getID() == accountID) {
				accounts.get(i).deposit(amount);
				return true;
			}
		}
		return false;
	}
	//checked
	public boolean withdraw(String accountID, double amount) {
		for (int i = 0; i < numberOfAccounts(); i++) {
			if(accounts.get(i).getID() == accountID) {
				accounts.get(i).withdraw(amount);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean withdrawUsingCheck(String accountID, double amount) {
		return ((Checking_Account) getAccount(accountID)).withdrawUsingCheck(amount);
	}
	
	
	//checked
	public boolean transfer(String fromaccountID, String toAccountID, double amount) {
		if(withdraw(fromaccountID, amount) && deposit(toAccountID, amount)) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	//checked
	public void addInterest() {
		for(int i = 0; i < numberOfAccounts(); i++) {
			 ((SavingsAccount) accounts.get(i)).addInterest(savingsInterestRate);
		}
	}
	
	public void reset() {
		for(int i = 0; i < numberOfAccounts(); i++) {
			 ((Checking_Account) accounts.get(i)).resetChecksUsed();
		}
	}
	public int getChecksUsed(String accountID) {
		return ((Checking_Account) getAccount(accountID)).getChecksUsed();
	}
	
}
