package JavaSessions;

public class IncrementalAndDecrementOperators {

	public static void main(String[] args) {
		//post increment
		
		int a=1;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		
		int c=99;
		int d=c++;
		
		System.out.println(c);
		System.out.println(d);
				
		//pre increment
		int e=999;
		int f=++e;
		
		System.out.println(e);//1000
		System.out.println(f);//1000
		
		int m= 49;
		int n=++m;
		System.out.println(m);//50
		System.out.println(n);//50
		
		//post decrement
		
		int x=100;
		int y=x--;
		
		System.out.println(x);//99
		System.out.println(y);//100
		
		int z=1;
		int u=z--;
		
		System.out.println(z);//0
		System.out.println(u);//1
		
		//pre decrement
		
		int t= 2;
		int v=--t;
		
		System.out.println(t);//1
		System.out.println(v);//1
		
		int a1= 100;
		int b1=--a1;
		
		System.out.println(a1);
		System.out.println(b1);

	}

}
