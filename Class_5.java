package pkg_3;

public class Class_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		String str1 = "ABCDE";
		String str2 = "aBCDE";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		if (str1.equals(str2)) {
			System.out.println("Strings are Equal");
		} else {
			System.out.println("strings are not equal");
		}
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		String patt = "[A-Z]{1,}";
		System.out.println(str1.matches(patt));
	}

}
