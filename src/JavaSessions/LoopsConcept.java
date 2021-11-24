package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	System.out.println("4");
	
	
	//while loop
	//for
	//do while
	
	//while loop
	
	int a=1;// Initialization
	
	while(a<=10) {// condition
		System.out.println(a); //statement or logic
		//a=a+1;
		//a++;
		++a;// increment or decerement
	}
	System.out.println("_________________________");
	int b=1;
	while(b<=9) {
		System.out.println(b++);
	}
	
	System.out.println("_________________________");
	//for loop
		for(int c=11;c<=20;c++) {
			System.out.println(c);
		}
		System.out.println("_________________________");
		for(int c=21;c<=30;) {
			System.out.println(c);
			c++;
		}
		
		int d=100;// unwanted
		for( d=100;d<=110;d++) {
			System.out.println(d);
		}
		System.out.println("***************************");	
		/*
		 * for(;;) { System.out.println("Hiii"); }
		 */
		System.out.println("***************************");
		for (char x='A';x<='Z';x++) {
			System.out.println(x);
		}
		
		for (int y='a';y<='z';y++) {
			System.out.println(y);
		}
		System.out.println("***************************");
		for (double d1=1.1;d1<=10.1;d1++) {
			System.out.println(d1);
		}
		
		for (int h=1;h<=10;h++) {
			System.out.println(h);
			if(h%5==0) {
				System.out.println("Hello");
				break;
			}
		}
		// print even numbers up to 10
		// print odd numbers up to 10 Assignment
		System.out.println("-------------------------------");
		for(int k=2;k<=10;k++) {
			if(k%2==0) {
				System.out.println(k);
			}
		}
		System.out.println("-------------------------------");
		for(int j=2;j<=10;j=j+2) {
			System.out.println(j);
		}
		
		
		System.out.println("###############################");
		//do-while
		int r=1;
		do {
			System.out.println(r);
			r++;
		}while(r<=10);
	}
	
	
	

}
