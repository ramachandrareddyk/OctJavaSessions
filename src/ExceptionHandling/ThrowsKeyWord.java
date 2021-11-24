package ExceptionHandling;

public class ThrowsKeyWord {

	public void m1() {
		System.out.println("M1");
		
		m2();
	}
	public void m2() {
		System.out.println("M2");
		m3();
	}
	public void m3() {
		System.out.println("M3");
		m4();
	}
	public void m4() throws ArithmeticException{
		System.out.println("M4");
		try {
		m5();
		}catch (ArithmeticException e) {
			
			System.out.println("Get AE exception....");
		}
	}
	public void m5() throws ArithmeticException {
		System.out.println("M5");
		
		int a= 9/0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsKeyWord t= new ThrowsKeyWord();
		t.m1();
	}

}
