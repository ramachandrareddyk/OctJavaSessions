package Interface;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b= new SBI();
		
		System.out.println("Rate of intrest : "+b.rateOfIntrest());
		
		Bank b1= new HDFC();
		
		System.out.println("Rate of intrest : "+b1.rateOfIntrest());
	}

}
