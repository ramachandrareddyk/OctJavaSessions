package JavaSessions;

public class MethodOverLoading {
//
	//Method overloding
	// inSide the class
	//1. With the same name 
	//2. With diff type of variables and number of parameters
	//3. Sequence of the parameters
	public static void main(String[] args) {
		MethodOverLoading m=new MethodOverLoading();
		
		m.login(8724897, 87263487);
		m.login("", "");
	}
	
	public void login() {
		System.out.println("login");
	}

	public void login(int a) {
		
	}
	
	/*
	 * public void login(int a, int b) {
	 * 
	 * }
	 */
	
	//
	
	public void login(int mobile, int otp) {
		System.out.println("Login to amazon");
	}
	
	public void login(String username, String pss) {
		System.out.println("Login to amazon with username and pass");
	}
	
	//search products in amazon
	
	public void search() {
		
	}
	
	public void search(String pname) {
		
	}
	
	public void search(int pid) {
		
	}
	
public void search(String pname, int price) {
		
	}

public void search(String pname, String Seller) {
	
}
}
