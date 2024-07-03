package JavaBasics;

public class BankAccount {
	String accountNumber;
	double balance;
	//int a;
	
	public BankAccount(String accountNumber, double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
		
		
		
	}
	
	public void deposit( double amt)
	{
		balance=amt+balance;
		
		
	}
	
	public void withdraw( double amt)
	{
		balance=balance-amt;
		
	}

	public static void main(String[] args) {
		BankAccount ob=new BankAccount("12345",10000);
		System.out.println(" The initial balance :" +ob.balance);
		ob.deposit(2000);
		System.out.println("The total balance after deposit is :" +ob.balance);
		ob.withdraw(3000);
		System.out.println("The total balance after withdras is :" +ob.balance);

	}

}
