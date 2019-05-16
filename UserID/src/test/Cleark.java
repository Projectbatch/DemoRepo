package test;

public class Cleark {

	public static void main(String[] args) {
		BankAccount acc=new BankAccount();
		acc.setBalance(1500);
		System.out.println(acc.getBalance());
		
		acc.setBalance(-1000);
		//System.out.println(acc.getBalance());
	}
	
}
