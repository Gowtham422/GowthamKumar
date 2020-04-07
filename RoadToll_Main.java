package pkg_1;

public class RoadToll_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Road_Toll rt1 = new Road_Toll();
		
		rt1.type = "Sedan";
		rt1.tireCount = 4;
		rt1.calculateToll();
		
		Road_Toll rt2 = new Road_Toll("Truck", 6);
		rt2.calculateToll();

	}

}
