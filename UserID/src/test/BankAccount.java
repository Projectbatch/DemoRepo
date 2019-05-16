package test;

public class BankAccount {
	double balance;
	public void setBalance(double balance) {
		if(balance<=0) {
			System.out.println("Do not enter -ve amount...");
		}
		else {
			this.balance=balance;
		}
	}
	
	public double getBalance() {
		return balance;
	}
}
