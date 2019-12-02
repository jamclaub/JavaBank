
public class JavaBank {

	
	public static void main(String[] args) {
		JavaBank bank = new JavaBank();
		Bank daBank = new Bank();
		
		
		// start of tests
		
		bank.createAccountsSavingsChecking(daBank);
		//bank.setIntrest(daBank);
		bank.AccountNumberandAddTwoAccounts(daBank);
		//bank.depositmoney(daBank);
		//bank.withdrawMoney(daBank);
		bank.transferMoney(daBank);
		//bank.getID(daBank);
		bank.UsingChecks(daBank);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public void setIntrest(Bank Bank) {
		Bank.setSavingsInterest(.1);
	}
	public void createAccountsSavingsChecking(Bank Bank) {
		//creating and adding two accounts one savings the other checking.
				SavingsAccount SavingsAcc = new SavingsAccount("Myboi today", 10000);
				Checking_Account CheckingAcc = new Checking_Account("Otherboi today", 300);
				Bank.addAccount(SavingsAcc);
				Bank.addAccount(CheckingAcc);
	}
	public void AccountNumberandAddTwoAccounts(Bank Bank) {
		// seeing how many accounts there are in the bank
		System.out.println(Bank.numberOfAccounts());
		System.out.println(Bank.getAccount("Myboi today").getBalance());
		System.out.println(Bank.getAccount("Otherboi today").getBalance());
	}
	public void depositmoney(Bank Bank) {

		// DEPOSITING MONEY
				if(Bank.deposit("Myboi today", 1000)) {
					System.out.println("Deposit 1000 int Myboi today's account");
				}
				else {System.out.println("error in deposit");}
				System.out.println(Bank.getAccount("Myboi today").getBalance());
				System.out.println(Bank.getAccount("Otherboi today").getBalance());
	}
	public void withdrawMoney(Bank Bank) {
		// WITHDRAW MONEY
		if(Bank.withdraw("Myboi today", 300)) {
			System.out.println("withdraws 300 from Myboi today's account");
		}
		else {System.out.println("errors in withdraw");}
		System.out.println(Bank.getAccount("Myboi today").getBalance());
		System.out.println(Bank.getAccount("Otherboi today").getBalance());
	}
	public void transferMoney(Bank Bank) {
		// TRANSFER MONEY
		if(Bank.transfer("Myboi today", "Otherboi today", 200)) {
			System.out.println("transfer 200 from Myboi today to Otherboi today");
		}
		else {System.out.println("errors in transfer");}
		System.out.println(Bank.getAccount("Myboi today").getBalance());
		System.out.println(Bank.getAccount("Otherboi today").getBalance());
	}
	public void addintrest(Bank Bank) {
		Bank.addInterest();
		System.out.println(Bank.getAccount("Myboi today").getBalance());
		System.out.println(Bank.getAccount("Otherboi today").getBalance());
	}
	public void getID(Bank Bank) {
		System.out.println(Bank.getAccount("Myboi today").getID());
		System.out.println(Bank.getAccount("Myboi today").getBalance());
		System.out.println(Bank.getAccount("Myboi today").toString());
	}
	public void UsingChecks(Bank Bank) {
		
		Bank.withdrawUsingCheck("Otherboi today", 19.00);
		System.out.println(Bank.getAccount("Otherboi today").toString());
		
		Bank.withdrawUsingCheck("Otherboi today", 19.00);
		System.out.println(Bank.getAccount("Otherboi today").toString());
		
		Bank.withdrawUsingCheck("Otherboi today", 19.00);
		System.out.println(Bank.getAccount("Otherboi today").toString());
		System.out.println(Bank.getChecksUsed("Otherboi today"));
		
		Bank.withdrawUsingCheck("Otherboi today", 19.00);
		System.out.println(Bank.getAccount("Otherboi today").toString());
		
		Bank.withdrawUsingCheck("Otherboi today", 19.00);
		System.out.println(Bank.getAccount("Otherboi today").toString());
		System.out.println(Bank.getChecksUsed("Otherboi today"));
		
		Bank.getAccount("Otherboi today").withdraw(195.00);
		System.out.println(Bank.getAccount("Otherboi today").getBalance());
		
		Bank.withdrawUsingCheck("Otherboi today", 7);
		System.out.println(Bank.getAccount("Otherboi today").getBalance());
		Bank.withdrawUsingCheck("Otherboi today", 10);
		System.out.println(Bank.getAccount("Otherboi today").getBalance());
		System.out.println(String.format("final checks used: %d", Bank.getChecksUsed("Otherboi today")));
	}
}
