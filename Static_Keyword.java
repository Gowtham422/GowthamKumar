package oops_concept;

public class Static_Keyword {
	
	static String name = "ABC";
	byte age = 6;
	String grade = "1st";
	
	public void displayDetails( ) {
		System.out.println("Student" + name + " is " + age + " years old and in " + grade + " grade ");
	}
	
	public static void doThis() {
		System.out.println("Do this Executed");
	}

}
