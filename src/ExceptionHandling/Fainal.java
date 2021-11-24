package ExceptionHandling;

public class Fainal {

	public static void main(String[] args) {
		
		try {
			int a=9/0;
		}catch (ArithmeticException e) {
			System.out.println("Ae Exception....");
		}finally {
			System.out.println("Hello....");
		}
		//DB connection--connection is buld
		//get data using query----geting exception
		//Colse connection--finally block
	}

}
