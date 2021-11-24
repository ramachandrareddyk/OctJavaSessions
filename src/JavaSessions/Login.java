package JavaSessions;

public class Login {

	String URL;
	String username;
	String pass;
	String title;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Login amazon= new Login();
		
		amazon.URL="www.amazon.in";
		amazon.username="abc@gmail.com";
		amazon.pass="hbasuhdb";
		amazon.title="login";
		
		System.out.println(amazon.URL+" "+amazon.username+" "+amazon.pass+" "+amazon.title);
	
		Login flipkart = new Login();
		flipkart.username="XYZ@gmail.com";
		flipkart.pass="123456";
		
		System.out.println(flipkart.username);
		System.out.println(flipkart.pass);
		System.out.println(flipkart.title);
	
	
	}
	
	

}
