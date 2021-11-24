package JavaSessions;

public class StaticMethods {

	String name;
	static int age;
	
	public void getName() {
		System.out.println("Get Name");
	}
	
	public static void getInfo() {
		System.out.println("Get Info");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethods s=new StaticMethods();
		
		s.name="Tom";
		s.getName();
		//1. With out object we can able to call static methods
		getInfo();
		age=45;
		
		//2. Using class name
		StaticMethods.getInfo();
		StaticMethods.age=55;
		//3. using object
		s.getInfo();
		s.age=60;
	}

}
