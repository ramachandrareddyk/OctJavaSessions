package JavaSessions;

public class MethodsInJava {

	
	//Static methods
	//Non static methods
	
	//Rules
	//We can't able to create the methods in side the methods
	//We can't create the duplicate methods
	//Non ststic methods we can call with object
	public static void main(String[] args) {
		
		MethodsInJava m=new MethodsInJava();
		m.test();
		System.out.println(m.sum());
		
		int x=m.add(40, 60);
		System.out.println(x);
	}
	
	//1. No input and no return
	public void test() {
		
		System.out.println("Test Method");
	}
	
	//2. no input but return somthing
	public int sum() {
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	//3. Some input and return some
	
	public int add(int a, int b) {
		
		int sum=a+b;
		
		return sum;
	}
	

}
