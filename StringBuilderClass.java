package special_classes;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "I";
		str1 = str1 + " like ";
		str1 = str1 + " Java ";
		
		System.out.println(str1);

		StringBuilder sb1 = new StringBuilder("I");
		sb1.append(" Like ");
		sb1.append(" Java ");
		
		System.out.println(sb1);
		
	}

}
