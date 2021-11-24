package Inheritence;

public class BMW extends Car {

	//Method overriding
	//When we have method in parent class with same name and parameters
	//Can't override the static methods
	@Override
	public void start() {
		System.out.println("BMW ------- start");
		
	}

	/*
	 * @Override public void stop() { System.out.println("BMW----Stop"); }
	 */
	@Override
	public void price() {
		System.out.println("BMW-------price");
	}
	
	public static void Capasity() {
		System.out.println("Capsity of BMW");
	}
	
	public void color() {
		System.out.println("color----");
	}
}
