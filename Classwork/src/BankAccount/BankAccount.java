package BankAccount;

public class BankAccount {
	String customerName;
	double balance;
	
	public static void main(String[]args)
	{
		BankAccount acct1 = new BankAccount("Laura Gray", 51.71);
		acct1.withdrawCash(20.34);
	}
	
	public BankAccount(String name, double bal)
	{
		customerName = name;
		balance = bal;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void depositCash(double balance)
	{
		System.out.println("Previous Balance: $"+this.balance);
		System.out.println("Deposit: $"+balance);
		this.balance+=balance;
		System.out.println("Current Balance: $"+this.balance);
	}
	
	public void withdrawCash(double balance)
	{
		if(this.balance>=balance)
		{
			System.out.println("Previous Balance: $"+this.balance);
			System.out.println("Withdrawal: $"+balance);
			this.balance-=balance;
			System.out.println("Current Balance: $"+this.balance);
		}
		else
		{
			System.out.println("Balance: $"+this.balance);
			System.out.println("Withdrawal: $"+balance);
			System.out.println("Insufficient funds for withdrawal.");
		}
	}
	
}
