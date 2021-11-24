package ExceptionHandling;

public class TryCatch {

	String a=null;
	public static void main(String[] args) {
		
		System.out.println("Hello,,,,");
		System.out.println("Hello,,,,");
		System.out.println("Hello,,,,");
		try {
			
			TryCatch t= new TryCatch();
			t=null;
			//t.a="ram";
		int a=9/0;
		}catch (ArithmeticException e) {
			
			System.out.println("Get AE exception.....");
			//e.printStackTrace();
		} catch (NullPointerException e) {
			
			System.out.println("Get NPE exception.....");
			// TODO: handle exception
		}
		System.out.println("Test,,,,");
		System.out.println("Test,,,,");
		System.out.println("Test,,,,");
		
	}

}
