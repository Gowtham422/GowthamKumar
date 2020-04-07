package special_classes;

public class StringBuilderClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb1 = new StringBuilder("Learning is fun");
		sb1.insert(9, " Java ");
		System.out.println(sb1);
		
		sb1.replace(9, 14, "Everything");
		System.out.println(sb1);
		
		sb1.deleteCharAt(0);
		System.out.println(sb1);
		
		sb1.delete(2, 10);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		

	}

}
