package JavaSessions;

public class MainMethodOverloading {

	
	  public static void main(String[] args) {
	  
	  System.out.println("My Main Method");
	  
	  main(40);
	  }
	 
	
	public static void main(int a) {
		System.out.println("Main method"+a);
	}
	
	public void main(int a, String s) {
		System.out.println("Main method"+a+"  "+s);
	}
	
	public void main(int a, boolean isActive) {
		System.out.println("Main method"+a+"  "+isActive);
	}

}
