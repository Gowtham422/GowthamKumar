package pkg_1;

public class Access_Specifiers {
	
	public int a = 100;
	int b = 200;
	private int c = 300;
	
	public void doThisPublic() {
		System.out.println("Public Method");
	}
	
	private void doThisPublic() {
		System.out.println("Private Method");
	}
	
	public void doThisPublic() {
		System.out.println("Private Method");
	}

}
