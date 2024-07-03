package Javaselenium;

public class BankAccount {
	private String owner;
	private String Accountnumber;
	private double balance;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAccountnumber() {
		return Accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		Accountnumber = accountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt)
	{
		balance=amt+balance;
		
		
	}
	
	public void withdraw(double amt)
	{
		balance=balance-amt;
		
	}
	
	public void print()
	{
		System.out.println(getOwner() + " " +getAccountnumber());
		System.out.println("The final balance is : "+getBalance());
		
		
	}
	
	
	

}
