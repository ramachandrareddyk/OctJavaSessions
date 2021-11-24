package JavaSessions;

public class DataCoversions {

	
	
	//Widening type casting -byte-short->int->Long->float->Double
	//Narrowing type casting
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		
		long y=x;
		
		float z=y;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		double d=188.88;
		
		long l=(long)d;
		
		int i=(int)l;
		
		System.out.println(d);
		System.out.println(l);
		System.out.println(i);
		
		convertStringToInt();
	}
	//Integer ParseInt
	public static void convertStringToInt() {
		
		String a="3000";
		int i=300;
		System.out.println(i+a);
		int b=Integer.parseInt(a);
		
		
		
		
		System.out.println(i+b);
	}

}
