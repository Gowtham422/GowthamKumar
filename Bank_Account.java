package temp;

public class Bank_Account {
	
	private long acNo;
	private String acName;
	private double acBalance;
	
	public void deposit(double amt) {
		if (amt > 0) {
			acBalance = acBalance + amt;
			System.out.println("Successfully deposited $" + amt );
		} else {
			System.out.println("cannot deposit" + amt);
			
		}
	}
	
	public void withdraw(double amt) {
		if (amt > 0) {
			acBalance = acBalance + amt;
			System.out.println("Successfully withdrawn $" + amt );
		} else {
			System.out.println("cannot withdraw" + amt);
			
		}
	}
	
	public void displayCurrentBalance() {
		System.out.println("the current balance is $" + acBalance );
	}
	
	public Bank_Account(long acNo,String acName,double acBalance) {
		this.acNo = acNo;
		this.acName = acName;
		this.acBalance = acBalance;
	}

}
