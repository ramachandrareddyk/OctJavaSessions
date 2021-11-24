package JavaSessions;

public class SwitchCase {

	public static void main(String[] args) {
		
		String browser="chrome";
		
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
			
		case "ie":
			System.out.println("Launch ie");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;

		default:
			break;
		}

	}

}
