package Encapsulation;

public class Webdriver {

	
	public void lauchBrowser(String browser) {
		
		if(browser.equals("Chrome")) {//==
			launchChrome();
		} else if(browser.equals("FF")) {
			launchFirefox();
		} else if (browser.equals("safari")) {
			launchSafari();
		} else {
			System.out.println("please pass correct browser");
		}
		
	}
	
	private void launchChrome() {
		
		System.out.println("Checking chrome version");
		System.out.println("Checking OS version");
		System.out.println("Launch browser");
	}
	
private void launchFirefox() {
		
		System.out.println("Checking Firefox version");
		System.out.println("Checking OS version");
		System.out.println("Launch browser");
	}

private void launchSafari() {
	
	System.out.println("Checking Safari version");
	System.out.println("Checking OS version");
	System.out.println("Launch browser");
}
}
