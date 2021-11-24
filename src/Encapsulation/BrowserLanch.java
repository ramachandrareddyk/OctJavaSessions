package Encapsulation;

public class BrowserLanch {
	
	
	public void launchBroeser() {
		
		System.out.println("Launch my browser");
		browserversion();
		windowsOsVersion();
		ramCapasity();
	}
	
	private void browserversion() {
		System.out.println("Check browser version");
	}
	
	private void windowsOsVersion() {
		System.out.println("Check windows version");
	}
	
	private void ramCapasity() {
		System.out.println("Check ram");
	}

	
	//Webdriver driver = new chrome driver();
}
