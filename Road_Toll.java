package pkg_1;

public class Road_Toll {
	
	String type;
	int tireCount;
	
	public void calculateToll() {
		if (tireCount == 2) {
			System.out.println("Your Toll amount is 0");
		} else if (tireCount == 4) {
			System.out.println("Your Toll amount is 10");
		} else if (tireCount > 4) {
			System.out.println("Your Toll amount is 20");
		} else {
			System.out.println("Incorrect tire count");
		}
	}
	
	public Road_Toll() {
		System.out.println("Constructor is executed");
	}
	
	public Road_Toll(String type, int tireCount) {
		this.type = type;
		this.tireCount = tireCount;
		
			
	}

}
