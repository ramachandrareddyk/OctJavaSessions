package JavaSessions;

public class ConditionalOpereaters {

	public static void main(String[] args) {
		//Mathamatical operaters: +,-,*,/,%
		//Relational opereters =
			//Comparision= <,>,<=,>=
			//Equal Operaters: ==, !=
		//logical operators : and , Or
		
		int a=10;
		int b=20;
		System.out.println(a+b);
		int c=a+b;
		System.out.println(c);
		
		int d=a-b;
		System.out.println(d);
		
		int e=a*b;
		System.out.println(e);
		
		int f=a/b;
		System.out.println(f);
		
		int g=a%b;
		System.out.println(g);
		
		System.out.println(a==b);
		
		//if
		if (a==b) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		} 
		
		String s1="Java";
		String s2="java";
		
		if(s1.equals(s2)) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both strings are not equal");
		} 
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Both s1 and s2 strings are equal");
		} else {
			System.out.println("Both s1 and s2 strings are not equal");
		} 
		//dead code
		if(true) {
			System.out.println("Hello");
		} else {
			System.out.println("Hay");
		}
		//nested if
		
		int marks=90;
		
		if(marks>=50) {
			System.out.println("Pass");
			if(marks>=60) {
				System.out.println("Grade B");
				if(marks>=80) {
					System.out.println("Grade A");
				}
			}
		}
		
		String browser ="Safari";
		
		if(browser.equals("Chrome")) {
			System.out.println("Launch chrome");
		}
		if(browser.equals("Safari"))
		{
			System.out.println("Launch Safari");
		}
		
		if(browser.equals("FireFox"))
		{
			System.out.println("Launch FireFox");
		}
		if(browser.equals("IE"))
		{
			System.out.println("Launch IE");
		}
		
		//if else if
		
		if(browser.equals("Chrome")) {
			System.out.println("Launch chrome");
		}
		else if(browser.equals("Safari"))
		{
			System.out.println("Launch Safari");
		}
		
		else if(browser.equals("FireFox"))
		{
			System.out.println("Launch FireFox");
		}
		else if(browser.equals("IE"))
		{
			System.out.println("Launch IE");
		}
		
		int x=200;
		int y=400;
		int z=500;
		
		if(x>y && x>z) {// false & false= false
			System.out.println("x is the max number");
		} else if(y>z) {
			System.out.println("Y is the max number");
		} else {
			System.out.println("z is the max number");
		}
		
		//assignment 5 int varibles print the max number
		
		char c2='A';
		char c1='a';
		
		if(c2==c1) {
			System.out.println("hello");
		}
		
		if(c2==65) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}

}
