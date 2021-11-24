package JavaSessions;

public class StringCancatenations {

	public static void main(String[] args) {
		
		String s="HelloRam";
		System.out.println(s);

		String s2="20";
		System.out.println(s2);
		
		int i=20;
		int i1=30;
		
		String x= "Hello";
		String y= "Selenium";
		
		String x1="20";
		String y1="30";
		
		
		System.out.println(i+i1);//50
		System.out.println(x+y);//HelloSelenium
		
		System.out.println(x1+y1);
		
		System.out.println(i+i1+x+y);
		
		System.out.println(x+y+i+i1);
		
		System.out.println(x+y+(i+i1));
		
		System.out.println("the value of i :"+i);
		
		System.out.println("the value of i :"+i1);
		
		System.out.println("The sum is :"+i+i1);
		
		System.out.println("The sum is :"+(i+i1));
	}

}
