package pkg_1;

public class Employee {
	
	String empName = "ABC";
	int empid = 100;
	int empsalary = 1000;
	
	public void displayEmployeebonus() {
		
		System.out.println("Employee " + empName + "gets the bonus of" + (empsalary * 0.2) );
	}

}
