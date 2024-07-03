package Javaselenium;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ob=new BankAccount();
		ob.setOwner("visa");
		ob.setAccountnumber("12345678");
		ob.setBalance(5000);
		ob.deposit(2000);
		ob.print();
		ob.withdraw(3000);
		ob.print();
		

	}

}
