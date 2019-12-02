

abstract class Account {
	protected String id;
	protected double balance;
	
	
	public Account(String id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	// returns Account ID checked
	public String getID() {
		return id;
	}
	// returns Balance 
	//checked
	public double getBalance() {
		return balance;
	}
	// returns the ID and Balance
	// checked
	public String toString() {
		return String.format("ID :%s, Balance: %.2f", id, balance);
	}
	
	public abstract boolean withdraw(double amount);
	public abstract void deposit(double amount);
}

