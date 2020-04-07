package pkg_3;

public class Class_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "CONCATENAT1234ON 1234PROVES W1234TH PRACT1234CE";
		String str2 = "1234";
		String str3 = "I";
		
		System.out.println(str1.replace(str2, str3));
		
		String str4 = "EITH#%&ER @*YOU $%#@CONTROL";
		String patt = "[^A-Za-z0-9\\s]";
		
		System.out.println(str4.replaceAll(patt, ""));
				

	}

}
