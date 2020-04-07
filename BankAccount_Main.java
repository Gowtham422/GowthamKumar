package temp;

public class BankAccount_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank_Account b1 = new Bank_Account(123456,"ABC",10000);
		
		b1.displayCurrentBalance();
		b1.withdraw(2000);
		b1.displayCurrentBalance();
		b1.deposit(-1000);
		b1.displayCurrentBalance();
		b1.deposit(20000);
		b1.displayCurrentBalance();
		

	}

}
