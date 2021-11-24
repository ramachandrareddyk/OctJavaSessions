package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		int b=200;
	
		b=300;
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println("LI "+0);
		System.out.println("length= "+i.length);
		System.out.println("size= "+(i.length-1));
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		System.out.println("----------------------------------");
		//to print all the value from array
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		System.out.println("----------------------------------");
		//if use <=
		/*
		 * for(int j=0;j<=i.length;j++) { System.out.println(i[j]); }
		 */
		System.out.println("----------------------------------");
		//if use <=
		for(int j=0;j<=i.length-1;j++) {
			System.out.println(i[j]);
		}
		System.out.println("----------------------------------");
		//for each loop
		
		for(int e :i) {
			System.out.println(e);
		}
		
		double d[]=new double[2];
		d[0]=20.88;
		d[1]=57.899;
		
		for(int k=0;k<d.length;k++) {
			System.out.println(d[k]);
		}
		
		for(double d1:d) {
			System.out.println(d1);
		}
		
		char c1[]=new char[10];
		c1[0]='g';
		
		String s[]=new String[10000];
		
		s[0]="Ram";
		s[1]="ABC";
		s[2]="XYZ";
		for(int t=0;t<s.length;t++) {
			System.out.println(s[t]);
		}
		//limitations of the array
		//1. Size is fixed: static array
		//2. Only similar data types we can store in static array
		
		// Employee data
		//
		
		//Objects class
		
		Object employeData[]=new Object[5];
		employeData[0]="Rajesh";
		employeData[1]=10008;
		employeData[2]='M';
		employeData[3]=20000.87;
		for(int h=0; h<employeData.length;h++) {
			System.out.println(h+"="+employeData[h]);
		}
	}

}
